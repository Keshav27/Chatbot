package controllers;

import models.LoginForm;
import models.MessageForm;
import models.RegisterForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import services.LoginService;
import views.html.chatbot;
import views.html.login;
import views.html.register;

import javax.inject.Inject;

public class LoginController extends Controller {

    @Inject
    FormFactory formFactory;

    @Inject
    LoginService loginService;

    public Result preLogin(){
        Form<LoginForm> loginForm= formFactory.form(LoginForm.class);
        return ok(login.render(loginForm));
    }

    public Result login() {
        Form<LoginForm> loginFormForm = formFactory.form(LoginForm.class).bindFromRequest();
        LoginForm loginForm = loginFormForm.get();

        if (loginForm.getUsername() == null || loginForm.getUsername().isEmpty() ||
        loginForm.getPassword() == null || loginForm.getPassword().isEmpty()) {
            return badRequest("All fields are mandatory !!");
        }

        String loginStatus = loginService.login(loginForm.getUsername(), loginForm.getPassword());
        if (loginStatus == null) {
            Form<MessageForm> messageFormForm = formFactory.form(MessageForm.class);
            return ok(chatbot.render(loginForm.getUsername(), messageFormForm));
        } else {
            return badRequest(loginStatus);
        }
    }

    public Result preRegister(){
        Form<RegisterForm> registerForm= formFactory.form(RegisterForm.class);
        return ok(register.render(registerForm));
    }

    public Result register() {
        Form<RegisterForm> registerFormForm = formFactory.form(RegisterForm.class).bindFromRequest();
        RegisterForm registerForm = registerFormForm.get();

        if (registerForm.getUsername() == null || registerForm.getUsername().isEmpty() ||
                registerForm.getPassword() == null || registerForm.getPassword().isEmpty() ||
                registerForm.getConfirmPassword() == null || registerForm.getConfirmPassword().isEmpty()) {
            return badRequest("All fields are mandatory !!");
        }

        if(registerForm.getPassword().equals(registerForm.getConfirmPassword())){
            boolean registerStatus = loginService.register(registerForm.getUsername(), registerForm.getPassword());
            if (registerStatus) {
                Form<MessageForm> messageFormForm = formFactory.form(MessageForm.class);
                return ok(chatbot.render(registerForm.getUsername(), messageFormForm));
            } else {
                return badRequest("Username already in use");
            }
        }
        else{
            return badRequest("Password doesn't match");
        }
    }

    public Result logout(String username) {
        loginService.logout(username);

        Form<LoginForm> loginForm= formFactory.form(LoginForm.class);
        return ok(login.render(loginForm));
    }
}

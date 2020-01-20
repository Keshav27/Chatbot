package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import services.LoginService;

import javax.inject.Inject;

public class TestingController extends Controller {

    @Inject
    LoginService loginService;

    public Result testing(){
        String a = loginService.login("sailu","proca");
        return ok(String.valueOf(a));
    }

}

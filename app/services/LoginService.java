package services;

import models.User;
import repositories.UserRepository;

import javax.inject.Inject;

public class LoginService {

    @Inject
    UserRepository userRepository;

    public boolean register(String username, String password ) {
        if (userRepository.findByName(username) == null) {
            User user = new User(username, password);
            user.setIsloggedin(true);
            userRepository.save(user);
            return true;
        } else {
            return false;
        }
    }

    public String login(String username, String password){
        User user= userRepository.findByName(username);
        if(user==null){
            return "User not found";
        }
        else{
            if(!user.getPassword().equals(password)){
                return "Password mismatch";
            }
            else{
                user.setIsloggedin(true);
                userRepository.save(user);
                return null;
            }
        }
    }

    public void logout(String username){
        User user= userRepository.findByName(username);
        user.setIsloggedin(false);
        userRepository.save(user);
    }
}

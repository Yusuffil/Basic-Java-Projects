package Odev.business.concretes;

import Odev.business.abstracts.UserService;
import Odev.entities.concretes.User;
import Odev.business.abstracts.LoginService;
import Odev.core.abstracts.GoogleService;
public class UserManager implements UserService {
    private LoginService loginService;
    private GoogleService googleService;

    public UserManager(LoginService loginService, GoogleService googleService) {

        this.loginService = loginService;
        this.googleService = googleService;
    }

    @Override
    public void register(User user) {
        loginService.register(user);

    }

    @Override
    public void login(String email, String password) {
        loginService.login(email, password);


    }

    @Override
    public void registerToGoogle() {
        googleService.registerToSystem();

    }

}
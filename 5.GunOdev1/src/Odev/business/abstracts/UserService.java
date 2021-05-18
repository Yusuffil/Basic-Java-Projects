package Odev.business.abstracts;
import  Odev.entities.concretes.User;

import java.util.List;

public interface UserService {
    void register(User user);
    void login(String email, String password);
    void registerToGoogle();

}

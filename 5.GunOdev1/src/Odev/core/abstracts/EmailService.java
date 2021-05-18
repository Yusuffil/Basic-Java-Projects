package Odev.core.abstracts;
import  Odev.entities.concretes.User;

public interface EmailService {
    void sendVerifyEmail(User user);
    void clickToVerify(User user);
}


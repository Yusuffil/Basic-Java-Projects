package Odev.core.concretes;

import Odev.core.abstracts.EmailService;
import Odev.entities.concretes.User;

public class EmailManager implements EmailService {

    @Override
    public void sendVerifyEmail(User user) {
        System.out.println("Dogrulama linki email adresine yollandi : "+ user.geteMail());
    }

    @Override
    public void clickToVerify(User user) {
        System.out.println("Email adresinizi dogrulamak icin linke tiklayin: " + user.getFirstname());
    }
}

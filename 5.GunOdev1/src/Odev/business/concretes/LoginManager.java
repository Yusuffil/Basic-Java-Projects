package Odev.business.concretes;
import Odev.business.abstracts.LoginService;
import Odev.core.abstracts.CheckService;
import Odev.core.abstracts.EmailService;
import Odev.dataAccess.abstracts.UserDao;
import Odev.entities.concretes.User;

public class LoginManager implements LoginService{

    private EmailService emailService;
    private CheckService checkService;
    private UserDao userDao;

    public LoginManager(EmailService emailService, CheckService checkService, UserDao userDao) {
        super();
        this.emailService = emailService;
        this.checkService = checkService;
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {

        if (userDao.checkEmailExist(user)==true) {
            System.out.println("Kayit Basarisiz.\n" + user.geteMail() + " Bu email adresi daha once kullanilmis.");
            return;
        }
        if (checkService.checkFirstName(user.getFirstname())) {
            System.out.println("Isim dogrulandi");
        }
        else {
            return;
        }
        if (checkService.checkLastName(user.getLastname())) {
            System.out.println("Soy isim dogrulandi");
        }
        else {
            return;
        }
        if (checkService.checkEmail(user.geteMail())) {
            System.out.println("Email dogrulandi");
        }
        else {
            return;
        }
        if (checkService.checkPassword(user.getPassword())) {
            System.out.println("Sifre dogrulandi");
        }
        else {
            return;
        }

        emailService.sendVerifyEmail(user);
        emailService.clickToVerify(user);
        userDao.add(user);


    }
    @Override
    public void login(String email, String password) {
        for (User users : userDao.getAll()) {
            if (email==users.geteMail()) {

                if(password!=users.getPassword()) {
                    System.out.println("Giris basarisiz. Email yada sifrenizi kontrol ediniz.");
                    return;
                }
                System.out.println("Giris Basarili");
                return;

            }

        }

    }

}

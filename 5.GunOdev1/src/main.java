import Odev.business.abstracts.UserService;
import Odev.business.concretes.LoginManager;
import Odev.business.concretes.UserManager;
import Odev.core.adapters.GoogleManagerAdapter;
import Odev.core.concretes.CheckManager;
import Odev.core.concretes.EmailManager;
import Odev.dataAccess.abstracts.UserDao;
import Odev.dataAccess.concretes.InMemoryUserDao;
import Odev.entities.concretes.User;

public class main {

    public static void main(String[] args){
        UserService userService=new UserManager(new LoginManager(new EmailManager(), new CheckManager(),
                new InMemoryUserDao()),new GoogleManagerAdapter());
        User user = new User("Yusuf Gokcan","Fil","yusuffil50@gmail.com","123456");
        User user1 = new User("Onur","Erdas","erdasonur@gmail.com","456789");
        userService.register(user);
        System.out.println("Google simule edildi.");
        userService.registerToGoogle();
        System.out.println("***********************************************");
        userService.register(user1);
        userService.login("erdasonur@gmail.com", "852");
    }
}

package Odev.core.concretes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Odev.core.abstracts.CheckService;

public class CheckManager implements CheckService {

    public static final String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        // regex kullanıldı


    @Override
    public boolean checkFirstName(String firstName) {
        if (firstName.length()<3) {
            System.out.println("Isminiz en az 2 karakterden olusmalidir.");
            return false;
        }
        return true;
        }
        @Override
        public boolean checkLastName(String lastName) {
            if (lastName.length()<3) {
                System.out.println("Soyisminiz en az 2 karakterden olusmalidir. ");
                return false;
            }
            return true;

        }

        @Override
        public boolean checkEmail(String email) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if (!matcher.matches()) {
                System.err.println("E mail adresiniz @gmail.com icermelidir. ");
                return false;
            }
            return true;
        }

        @Override
        public boolean checkPassword(String password) {
            if (password.length()<6) {
                System.out.println("Sifreniz en az 6 karakter icermelidir. ");
                return false;
            }
            return true;

        }

    }


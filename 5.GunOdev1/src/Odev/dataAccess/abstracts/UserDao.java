package Odev.dataAccess.abstracts;
import Odev.entities.concretes.User;

import java.util.ArrayList;

public interface UserDao{
    void add(User user);
    ArrayList<User> getAll();
    void delete(User user);
    boolean checkEmailExist(User user);
}

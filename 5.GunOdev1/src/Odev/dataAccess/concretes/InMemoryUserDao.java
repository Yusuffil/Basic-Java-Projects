package Odev.dataAccess.concretes;

import Odev.dataAccess.abstracts.UserDao;
import Odev.entities.concretes.User;

import java.util.ArrayList;


public class InMemoryUserDao implements UserDao {
    public ArrayList<User> users = new ArrayList<User>();
    @Override
    public void add(User user) {
        users.add(user);
        System.out.println("Veritabanina bu kullanici eklendi : " + user.getFirstname()+" "+ user.getLastname());

    }

    @Override
    public ArrayList<User> getAll() {

        return this.users;
    }

    @Override
    public void delete(User user) {
        System.out.println("Veritabanindan bu kullanici silindi : " + user.getFirstname()+" " + user.getLastname());
    }

    @Override
    public boolean checkEmailExist(User user) {
        for(User u : users){
            if(u.geteMail().equals(user.geteMail())) {
                return true;
            }
        }
        return false;

    }

}

public interface IUserServices {
    void create(User user);
    boolean checkRealPerson(User user);
    void update(User user);
    void delete(User user);
}

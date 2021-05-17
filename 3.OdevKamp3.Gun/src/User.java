public class User implements IUserServices{
    private String firstname;
    private String lastname;
    private String dateOfBirth;
    private String nationalityId;

    public User(String firstname, String lastname, String dateOfBirth, String nationalityId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {

        this.lastname = lastname;
    }

    public String getDateOfBirth() {

        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {

        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {

        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {

        this.nationalityId = nationalityId;
    }
    @Override
    public boolean checkRealPerson(User user) {
        if(user.getNationalityId().length() == 11){
            return true;
        }
        return false;
    }
    @Override
    public void create(User user) {
        if(checkRealPerson(user) ==true){
        this.firstname = firstname;
        this.nationalityId = nationalityId;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        System.out.println("Kullanici Olusturuldu");
    }
        else{
            System.out.println("Kullanici gercek kisi olmadigi icin hesap olusturulamadi.");
        }
    }

    @Override
    public void update(User user) {
        this.firstname = firstname;
        this.nationalityId = nationalityId;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        System.out.println("Kullanici Bilgileri guncellendi.");
    }

    @Override
    public void delete(User user) {
        this.firstname = "0";
        this.nationalityId = "0";
        this.lastname = "0";
        this.dateOfBirth = "0";
        System.out.println("Kullanici silindi.");
    }
}

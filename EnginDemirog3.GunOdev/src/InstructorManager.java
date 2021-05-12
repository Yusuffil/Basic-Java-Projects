
public class InstructorManager {
    
    public boolean checkHomework(Students user){
        if(user.getHomework().equals("Yes")){  //Odev yapip yapmama durmunu Yes/No seklinde main classinda setledim../ /
            return true;
        }
        return false;
    }
    public void addToBanList(User user){
        System.out.println(user.getName() + user.getLastName() + " isimli ogrenci ban listesine eklendi");
    }
}


public class Main {

  
    public static void main(String[] args) {
       Students student1 = new Students();
       student1.setName("Onur");
       student1.setLastName("Erdas");
       student1.setHomework("Yes");
       
       Students student2 = new Students();
       student2.setName("Murat");
       student2.setLastName("Coskun");
       student2.setHomework("No");
       
       Students student3 = new Students();
       student3.setName("Ali");
       student3.setLastName("Cebeci");
       student3.setHomework("No");
       
       StudentsManager manager = new StudentsManager();
       manager.addToCheckList(student1);
       manager.addToCheckList(student2);
       manager.addToCheckList(student3);
       
       System.out.println("**************************");
       User instructor = new Instructor();
       
       instructor.setName("Engin");
       instructor.setLastName("Demirog");
       
        System.out.println(instructor.getName() + instructor.getLastName());
       InstructorManager instructorManager = new InstructorManager();
       if(instructorManager.checkHomework(student1) == false){
           instructorManager.addToBanList(student1);
           
       }else {
           System.out.println(student1.getName()+student1.getLastName() + " isimli ogrenci odevini basariyla tamamlamistir.");
       }
       if(instructorManager.checkHomework(student2)== false){
           instructorManager.addToBanList(student2);
       }
       else {
           System.out.println(student2.getName()+student2.getLastName() + " isimli ogrenci odevini basariyla tamamlamistir.");
       }
       if(instructorManager.checkHomework(student3) == false){
           instructorManager.addToBanList(student3);
           
       }else {
           System.out.println(student3.getName()+student3.getLastName() + " isimli ogrenci odevini basariyla tamamlamistir.");
       }
       
       
    }
    
}

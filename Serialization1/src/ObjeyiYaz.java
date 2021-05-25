
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;




public class ObjeyiYaz {
    
    
    public static void main(String[] args){
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))){
            Ogrenci ogrenci1 = new Ogrenci("Yusuf Gokcan", 1234, "Elektrik Muhendisi");
            Ogrenci ogrenci2 = new Ogrenci("Onur Erdas", 45687, "Bilgisayar Muhendisi");
            
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadi.");;
        } catch (IOException ex) {
            System.out.println("Dosya acilirken IOException hatasi ile karsilasildi.");;
        }
            
    }

    
}

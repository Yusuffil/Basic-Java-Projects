
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;




public class ObjeyiYaz {
    
    
    public static void main(String[] args){
        Ogrenci ogrenci1 = new Ogrenci("Yusuf Gokcan", 329828, "Elektrik Muhendisi");
        Ogrenci ogrenci2 = new Ogrenci("Onur Erdas", 329465, "Bilgisayar Muhendisi");
        Ogrenci ogrenci3 = new Ogrenci("Emre Ozdemir", 329456, "Bilgisayar Muhendisi");
        
        Ogrenci[] ogrenci_array = {ogrenci1,ogrenci2,ogrenci3};
        ArrayList<Ogrenci> ogrenci_list = new ArrayList<Ogrenci>(Arrays.asList(ogrenci_array));
        
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){
            
            
            out.writeObject(ogrenci_array);
            out.writeObject(ogrenci_list);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadi.");;
        } catch (IOException ex) {
            System.out.println("Dosya acilirken IOException hatasi ile karsilasildi.");;
        }
            
    }

    
}


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;




public class ObjeyiOku {
    public static void main(String[] args) {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){
            Ogrenci[] ogrenci_array = (Ogrenci[])in.readObject();
            ArrayList<Ogrenci> ogrenci_list = (ArrayList<Ogrenci>)in.readObject();
           
            System.out.println("*************************");
            for(Ogrenci a: ogrenci_array){
                System.out.println(a);
                System.out.println("**************************");
            }
            System.out.println("**************************");
            for(Ogrenci a : ogrenci_list){
                System.out.println(a);
                System.out.println("************************");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunumadi..");;
        } catch (IOException ex) {
            System.out.println("Dosya acilirken IO Exception hatasi alindi.");;
        } catch (ClassNotFoundException ex) {
            System.out.println("Sinif Bulunamadi.");;
        }
    }
    
}

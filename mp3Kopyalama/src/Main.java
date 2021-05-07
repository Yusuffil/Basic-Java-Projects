
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();
    public static void dosyaOku(){
        try {
            FileInputStream in = new FileInputStream("LilNas.mp3");
            int oku;
            while((oku = in.read()) != -1){
                icerik.add(oku);
                
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception hatasi olustu.");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public static void Kopyala(String dosyaismi ){
        try {
            FileOutputStream out = new FileOutputStream(dosyaismi);
            for(int deger : icerik){
                out.write(deger);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public static void main(String[] args) {
       dosyaOku();
        Kopyala("Lil Nas Kopya.mp3");
    }
    
}

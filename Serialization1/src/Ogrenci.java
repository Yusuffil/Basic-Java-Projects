
import java.io.Serializable;


public class Ogrenci implements Serializable{
    private static final long  serialVersionUID = 1000; //UID 2000 ve Desler ozelligi eklenmeden obje yazimi yapilirsa ve sonrasinda 
                                                          //bu ozellik eklenirse IO Exceptin hatasi alinir.. 
    
    private String isim;
    private int id;
    private String bolum;

    
    
    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        String bilgiler = "Ogrenci Ismi : "+ isim +"\nOgrenci No : "+ id + "\nBolumu : "+bolum;
        return bilgiler;
    }
    
    
    
    public static void Ogrenci(String[] args) {
        
    }
}

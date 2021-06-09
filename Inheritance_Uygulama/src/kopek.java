
public class kopek extends Hayvan {
    
    private int dis_sayisi;
    
    public kopek(String isim, int kilo, int boy, int bacak_sayisi, int dis_sayisi){
        super(isim, kilo, boy, bacak_sayisi);
        this.dis_sayisi = dis_sayisi;
        
    }
public void hareketeGec(int hiz){
        System.out.println("Hayvan " + hiz + " ile hareket ediyor"); //Hayvan class'indaki metodu burda kullanarak Overrate edilmis oluyor.//
    }
    public void kos(int hiz){
        System.out.println("Kopek Kosuyor"); // Overrate edilmeden kullanmak istenirse 
        hareketeGec(hiz);                                     //super.hareketeGec(hiz) komutuyla yine ayni sey yazdirilabilir.
       
    }
    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
    
}


import java.util.Scanner;


public class Yolcu implements YurtDisiKurallari{
    private int harc;
    private boolean siyasiYasak;
    private boolean VizeDurumu;

    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatirdiginiz Harc Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
         System.out.println("Herhangi bir siyasi yasaginiz bulunuyor mu : ");
        String cevap = scanner.nextLine();
        if (cevap.equals("Evet")){
            this.siyasiYasak = true;
        }
        else {
            this.siyasiYasak = false;
        
        }
         System.out.println("Vizeniz Bulunuyor mu ? ");
         String cevap2 = scanner.nextLine();
         if(cevap2.equals("evet")){
             this.VizeDurumu =true;
         } 
         else {
            this.VizeDurumu = false;
         
         }
        
        
    }
    
    @Override
    public boolean YurtDisiHarci() {
        if(this.harc <15){
            System.out.println("Lutfen Yurt Disi Cikis Harcini Tam Yatirin");
     
        }
        else {
            System.out.println("Harc Tam olarak odenmistir");
            
        }    
        return true;
    }

    
    @Override
    public boolean SiyasiYasak() {
        if(this.siyasiYasak == true){
            System.out.println("Siyasi yasaginiz bulunuyor. Yurtdisina cikamazsiniz");
        return false;
        }
        else{
            System.out.println("Siyasi yasaginiz  bulunmuyor.");
        return true;
        }
        
    }

    @Override
    public boolean VizeDurumu() {
        if(this.VizeDurumu == true){
            System.out.println("Vizeniz vardir.Islem Tamam Yurtdisina cikabilirsiniz");
            return true;
        }
        else{
            System.out.println("Vizeniz bulunmuyor. Yurtdisina cikamazsiniz");
            return false;
        }
 
    }
    
    
}

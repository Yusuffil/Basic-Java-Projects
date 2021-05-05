
public class main {

    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gokcen Havalimanina Hosgeldiniz!!!!");
        String sartlar = "Yurtdisi Cikis Kurallari.....:\n"+"1. Herhangi bir siyasi yasaginizin olmamasi gerekmektetir.\n"
                        +"2. 15 TL Yurt disi harcini odemeniz gerekmektedir.\n"+ "3. Vizenizin olmasi gerekmektedir..\n";
        String message  = "Herhangi birtanesi yerine getirilmeyen kural durumunda yurtdisina cikamazsiniz..";
        
        
        while(true){
        System.out.println("*****************************************************");
        System.out.println(sartlar);
        System.out.println("*****************************************************");
        Yolcu yolcu = new Yolcu();
        
        System.out.println("YurtDisi Harci Kontrol Ediliyor....");
        
            Thread.sleep(3000);
            
        yolcu.YurtDisiHarci();
        
        if(yolcu.YurtDisiHarci()==false){
            System.out.println(message);
            continue;
        } 
            System.out.println("Siyasi yasak Kontrol ediliyor..");
            Thread.sleep(3000);
            if(yolcu.SiyasiYasak() == false){
                System.out.println(message);
                continue;
            }
            
            System.out.println("Vize Durumu Kontrol Ediliyor....");
            Thread.sleep(3000);
            if(yolcu.VizeDurumu()==false){
                System.out.println(message);
                continue;
            }
            
            System.out.println("Islemleriniz Tamamdir.Yurtdisina cikabilirsiinz");
            
            break;
        
        
        
        
        }
        
        
        
        
    }
    
}

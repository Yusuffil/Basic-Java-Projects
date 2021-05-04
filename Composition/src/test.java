
public class test {

    
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);
        kasa kasa = new kasa("Shadow Blade", "Shadow", "Temperli Cam");
        Anakart anakart = new Anakart("B250 Pro", "ASUS", 10, "Windows 10");
        Bilgisayar pc = new Bilgisayar(anakart, monitor, kasa);
        pc.getKasa().bilgisayariAc();
        pc.getMonitor().monitoruKapat();
        
    }
 
    
    
}

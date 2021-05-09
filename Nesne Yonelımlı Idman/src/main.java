import java.util.InputMismatchException;
import java.util.Scanner;


public class main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Idman Programanina Hosgeldiniz");
        String idmanlar = "Gecerli Hareketler..\n"+"Burpee\n"+"Pushup\n"+"Situp\n"+"Squat\n";
        System.out.println(idmanlar);
        System.out.println("Bir idman olusturunuz...");
        
        System.out.print("Burpee Sayisi : ");
        int burpee = scanner.nextInt();
        System.out.print("PushUp Sayisi : ");
        int pushup = scanner.nextInt();
        System.out.print("SitUp Sayisi : ");
        int situp = scanner.nextInt();
        System.out.print("Squat Sayisi : ");
        int squat = scanner.nextInt();
        scanner.nextLine();
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("Idmaniniz Basliyor...");
        
        
        
        while(idman.IdmanBittiMi() == false){
            System.out.println("Hareket Turu Giriniz (Burpee, PushUp, Situp, Squat) : ");
            String tur = scanner.nextLine();
            System.out.println("Antreman Sayisini Giriniz.");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
        }
    }
    
}

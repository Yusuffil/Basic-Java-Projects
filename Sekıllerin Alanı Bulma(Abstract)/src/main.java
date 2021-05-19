
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "Islemler......\n"+"1.Kare Alani Hesapla\n"+"2.Ucgen Alani Hesapla\n"+"3.Daire Alani\n"+"4.Cikis icin q'ya basiniz.";
        while(true){
            System.out.println("***********************");
            System.out.println(islemler);
            System.out.println("************************");
            System.out.println("Hangi Sekil Uzerinden hesaplama yapmak istiyorsunuz? Seciniz...");
            String sekilTuru = scanner.nextLine();
            Sekil sekil = null;
            if(sekilTuru.equals("q")){
            System.out.println("Cikis Gerceklestiriliyor..");
            break;
            }
            else if(sekilTuru.equals("1")){
                System.out.println("Karenin Kenari : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                sekil = new Kare("Kare 1", kenar);
                sekil.calculateArea();
                
            } else if (sekilTuru.equals("2")){
                
                System.out.println("Ucgenin 1. Kenari : ");
                int a = scanner.nextInt();
                System.out.println("Ucgenin 2. Kenari : ");
                int b = scanner.nextInt();
                System.out.println("Ucgenin 3. Kenari : ");
                int c = scanner.nextInt();
                scanner.nextLine();
                sekil = new Ucgen("Ucgen 1", a,b,c);
                sekil.calculateArea();
            }else if (sekilTuru.equals("3")){
                System.out.println("Yaricap Degeri : ");
                int yaricap = scanner.nextInt();
                sekil = new Daire("Daire 1", yaricap);
                sekil.calculateArea();
            }
            else{
                System.out.println("Gecersiz Islem..");
            }
        }
    
}
}

import java.util.Scanner;
public class main {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("***************************************");
        System.out.println("Yapmak istediginiz islemi seciniz");
        String islemler = "1. Toplama Islemi\n"
                         +"2. Cikarma Islemi\n"
                         +"3. Carpma Islemi\n"
                         +"4. Bolme islemi";
        System.out.println(islemler);
        System.out.println("***************************************");
        System.out.println("Islemi Seciniz");
      
        String islem = scanner.nextLine();
        
        switch(islem){
            case "1": 
                System.out.println("1.Sayinizi Giriniz : "); 
                a = scanner.nextInt();
                System.out.println("2.Sayinizi Giriniz : "); 
                b = scanner.nextInt();
                System.out.println("Toplam = "+ (a+b));   
            break;
            case "2": 
                System.out.println("1.Sayinizi Giriniz : "); 
                a = scanner.nextInt();
                System.out.println("2.Sayinizi Giriniz : "); 
                b = scanner.nextInt();
                System.out.println("Farki = "+ (a-b));   
            break;
            case "3":
                System.out.println("1.Sayinizi Giriniz : "); 
                a = scanner.nextInt();
                System.out.println("2.Sayinizi Giriniz : "); 
                b = scanner.nextInt();
                System.out.println("Carpim Sonucu = "+ (a*b));   
            break;
            case "4": 
                System.out.println("1.Sayinizi Giriniz : "); 
                a = scanner.nextInt();
                System.out.println("2.Sayinizi Giriniz : "); 
                b = scanner.nextInt();
                System.out.println("Bolumu = "+ (a/b));   
            break;
        }
    }
    
}

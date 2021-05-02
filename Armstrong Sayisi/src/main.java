import java.util.Scanner;

public class main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = scanner.nextInt();
        System.out.println("Basamak Sayisini Giriniz");
        int bsayi = scanner.nextInt();
        int toplam = 0, gecici_sayi;
        gecici_sayi = sayi;
        do{
            
            int basamakdeger = gecici_sayi%10;
            gecici_sayi /= 10;
            toplam += Math.pow(basamakdeger, bsayi);
        } while(gecici_sayi>0);
        if(sayi==toplam){
            System.out.println("Sayiniz Armstrong Sayisidir");
        }
        else{
            System.out.println("Sayiniz Armstrong Degildir ");
        }
    
    } 
    
}

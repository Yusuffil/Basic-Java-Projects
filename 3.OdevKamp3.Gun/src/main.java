import java.util.Scanner;

public class main{


        public static void main(String[] args){
        User user = new User("Yusuf Gokcan","Fil","24.11.1997","61723195442");
        user.create(user);
                Game game1 = new Game("Metin2",1,100);
                Game game2 = new Game("Kafa topu",2,200);
                Campain campain1 = new Campain("Ramazan Kampanyasi",1,30);
                Campain campain2 = new Campain("Yilbasi Kampanyasi",1,50);
                Trade trade  = new Trade("Metin2",1);
                trade.buy(user,game1,campain1);
                Trade trade2 = new Trade("Metin2",1);
                trade2.buy(user,game2,campain2);
                        }

                }










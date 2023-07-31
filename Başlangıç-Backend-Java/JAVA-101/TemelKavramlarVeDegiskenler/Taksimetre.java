import java.util.Scanner;


public class Taksimetre {
    public static void main(String[] args) {
        double kmPrice = 2.20, minPrice = 20, acilisUcreti  = 10, gidilenKm,totalPrice;


        Scanner input = new Scanner(System.in);


        System.out.println("Kaç km gittiniz? ");
        gidilenKm = input.nextDouble();

        totalPrice = gidilenKm* kmPrice;
        totalPrice += acilisUcreti;

        totalPrice = (totalPrice < minPrice) ? minPrice : totalPrice;
        System.out.println("Toplam Tutar : "+ totalPrice);



    }
}

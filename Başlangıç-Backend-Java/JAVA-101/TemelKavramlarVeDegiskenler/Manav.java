import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {

        double armutP = 2.14, elmaP = 3.67, domatesP = 1.11, muzP = 0.95,patlicanP = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        int armutKG = input.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        int elmaKG = input.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        int domatesKG = input.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        int muzKG = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        int patlicanKG = input.nextInt();


        double totalPrice = (armutKG*armutP)+(elmaKG*elmaP)+(domatesKG*domatesP)+(muzKG*muzP)+(patlicanKG*patlicanP);
        System.out.println("Toplam Tutar : "+totalPrice+" TL");


    }
}

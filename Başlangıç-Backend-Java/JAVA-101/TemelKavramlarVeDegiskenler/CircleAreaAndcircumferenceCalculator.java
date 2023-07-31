import java.util.Scanner;
public class CircleAreaAndcircumferenceCalculator{
    public static void main(String[] args) {
        double r, pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Yarı çapı giriniz : ");
        r = input.nextDouble();

        double tamCevre = 2*pi*r;
        double tamAlan = r*r*pi;

        System.out.println("Tam daire çevresi "+tamCevre);
        System.out.println("Tam daire alan "+tamAlan);

        double a;

        System.out.println("Alfa açısını giriniz : ");
        a = input.nextDouble();

        double aDilimAlan = (pi*(r*r)*a)/360;
        System.out.println("Alfa dilim alanı "+aDilimAlan);





    }
}

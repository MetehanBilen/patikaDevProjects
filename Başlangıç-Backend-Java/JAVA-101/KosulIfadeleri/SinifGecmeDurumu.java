
import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Türkçe Notunu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Kimya Notunu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Müzik Notunu giriniz: ");
        muzik = input.nextInt();

        double average = (mat+fizik+turkce+kimya+muzik)/5;
        if (average >55 )
        {
            System.out.println("Geçtiniz.");
        }
        else
        {
            System.out.println("Kaldınız.");
        }

    }
}

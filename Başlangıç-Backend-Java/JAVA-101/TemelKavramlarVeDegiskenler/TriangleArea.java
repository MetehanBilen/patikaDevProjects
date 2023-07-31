package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        //Değişken oluşturma
        double kenar1, kenar2, kenar3, u, area;


        // Kullanıcı veri girişi
        Scanner input = new Scanner(System.in);

        System.out.println("1. Kenarı giriniz : ");
        kenar1 = input.nextDouble();
        System.out.println("2. Kenarı giriniz : ");
        kenar2 = input.nextDouble();
        System.out.println("3. Kenarı giriniz : ");
        kenar3 = input.nextDouble();

        // Hesaplama ve çıktı
        u = (kenar1+kenar2+kenar3)/2 ;
        area = Math.sqrt( u *(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Triangle Area : "+ area);
    }
}

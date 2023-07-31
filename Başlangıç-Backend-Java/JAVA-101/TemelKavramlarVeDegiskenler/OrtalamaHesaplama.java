package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

/**
 * @author Metehan Bilen - 02.07.2023
 */
public class OrtalamaHesaplama {
    /* Girilen ders ortalamalarına göre geçip veya kaldığını döndürür.
    @param 3 adet dersin not ortalaması
    @return notOralaması: girilen derslerin not ortalamasını hesaplar. 60'dan büyük ise Geçtiniz, değilse Kaldınız yazar
    */
    public static void main(String[] args) {
        float matematikOrtalama, fizikOrtalama, kimyaOrtalama;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik ortalamasını giriniz: ");
        matematikOrtalama = input.nextFloat();

        System.out.println("Fizik ortalamasını giriniz: ");
        fizikOrtalama = input.nextFloat();

        System.out.println("Kimya ortalamasını giriniz: ");
        kimyaOrtalama = input.nextFloat();

        float notOrtamalamasi = (matematikOrtalama+fizikOrtalama+kimyaOrtalama)/3;

        System.out.println("Not ortalamanız: "+notOrtamalamasi);
        System.out.println( notOrtamalamasi< 60? "Kaldınız": "Geçtiniz");


    }
}

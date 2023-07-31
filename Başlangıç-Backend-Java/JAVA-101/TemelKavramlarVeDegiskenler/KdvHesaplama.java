import java.util.Scanner;


public class KdvHesaplama {
    public static void main(String[] args){
        double tutar, kdvOran = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.println("Tutarı Giriniz : ");
        tutar = input.nextDouble();

        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV Oranı : "+kdvOran);
        System.out.println("KDV Tutarı : "+kdvOran);

        System.out.println(kdvliTutar);

    }
}

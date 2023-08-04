import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz");
        n1 = input.nextInt();
        System.out.println("2. Sayıyı giriniz");
        n2 = input.nextInt();

        System.out.println("1- Toplama \n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch (select){
            case 1: //Toplama
                System.out.println(" Sonuç "+ (n1+n2));
                break;
            case 2: //Çıkarma
                System.out.println(" Sonuç "+ (n1-n2));
                break;
            case 3: //Çarpma
                System.out.println(" Sonuç "+ (n1*n2));
                break;
            case 4: //Bölme
                System.out.println(" Sonuç "+ (n1/n2));
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız.");

        }

    }
}





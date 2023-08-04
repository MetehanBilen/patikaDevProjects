import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args) {

        //inputs: Mesafe,yaş, yolculuk tipi(Tek yön:1; Gidiş-Dönüş:2)
        Scanner input = new Scanner(System.in);
        //ücret= mesafe*0.10 TL /KM
        int yas,yoluculukTipi;
        double mesafe,tutar;

        System.out.print("Mesafeyi giriniz : ");
        mesafe = input.nextDouble();
        System.out.print("Yasınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yoluculukTipi = input.nextInt();

        /*
        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2)
        olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         */
        if ( mesafe>0 && yas>0  && (yoluculukTipi==1 ||  yoluculukTipi==2)){
           tutar = mesafe * 0.10;
            if (yas< 24){
               if(yas<12){
                   tutar *=0.50;
               }
               else{
                   tutar *=0.90;
               }
            }
            else if (yas >65) {
                tutar *= 0.70;
            }
            if (yoluculukTipi==2) {
            tutar *= 0.80;
            tutar +=tutar;
            }

            System.out.print("Toplam Tutar : "+tutar+" TL");

        }
        else{
            System.out.println(" Hatalı Veri Girdiniz !");
        }


    }
}

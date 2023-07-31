import  java.util.Scanner;
public class FindHipotenus {
    public static void main(String[] args) {

        //Değişken oluşturma
        double tabanUzunluk, dikKenarUzunluk, hipotenus;


        // Kullanıcı veri girişi
        Scanner input = new Scanner(System.in);

        System.out.println("Taban Uzunluğu Giriniz : ");
        tabanUzunluk = input.nextDouble();

        System.out.println("Dik Kenar Uzunluğu Giriniz : ");
        dikKenarUzunluk = input.nextDouble();

        // Hesaplama ve çıktı
        hipotenus = Math.sqrt( Math.pow(tabanUzunluk,2)+Math.pow(dikKenarUzunluk,2) );
        System.out.println("Hipotenüs Değeri : "+ hipotenus);

    }
    }


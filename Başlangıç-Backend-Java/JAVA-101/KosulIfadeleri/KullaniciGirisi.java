import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        String userName, password,select;

        Scanner input = new Scanner(System.in);

        //Kullanıcı giriş
        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        //Kullanıcı adı ve şifre kontrol
        if (userName.equals("Admin") && password.equals("java123"))
        {
            System.out.print("Giriş yaptınız.");
        }
        else
        {   // Şifre yanlış ise
            System.out.println("Şifreyi sıfırlamak ister misiniz?\n E/H");
            select = input.nextLine();
            if (select.equals("E")) // Şifreyi sıfırlamak istenirse
            {
                System.out.println("Yeni şifre giriniz");
                password = input.nextLine();
                if(password.equals("java123")) //Tekrarlayan şifre
                {
                    System.out.println("Şifre oluşturulamadı.");
                }
                else
                {
                    System.out.println("Şifre oluşturuldu.");
                }

            }
            else
            {
                System.out.print("Giriş yapılamadı.");
            }

        }


    }



}

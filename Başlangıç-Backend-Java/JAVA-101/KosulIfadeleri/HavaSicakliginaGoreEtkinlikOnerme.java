import java.util.Scanner;



public class HavaSicakliginaGoreEtkinlikOnerme {

    public static void main(String[] args) {
        double heat;
        Scanner heatInput = new Scanner(System.in);

        System.out.println("Hava sıcaklığını giriniz. ");
        heat = heatInput.nextDouble();

        if (heat>=15){
            if (heat >=25){
                System.out.println("Yüzme");
            }
            else{
                System.out.println("Piknik");
            }
        }
        else{
            if(heat >=5){
                System.out.println("Sinema");
            }
            else
            {
                System.out.println("Kayak");
            }
        }








    }
}

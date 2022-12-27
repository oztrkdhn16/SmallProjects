package smallProject;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

    public static void main(String[] args) {

        System.out.println("Sayi Tahmin Oyununa Hosgeldiniz...");
        System.out.println("Oyunda 5 hakkiniz vardir.");
        System.out.println("Her kullandiginiz hak -20 puan sebebidir.");
        System.out.println("Ilk tahmininizde eger sayiyi bulabilirseniz 100 tam puan kazanacaksiniz.");
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();


        int oyunSayisi = rnd.nextInt(100);
        int hak = 5;
        int sayi = 0 ;
        int puan = 100/hak;
        int puaniniz = 100;
        System.out.println("1 ile 100 arasi bir sayi giriniz.");
        do {
            sayi = input.nextInt();
            if (sayi>oyunSayisi) {
                hak--;
                if (hak==0) {
                    continue;
                }
                System.out.println("Aradiginiz sayi asagida");

            } else if (sayi<oyunSayisi) {
                hak--;
                if (hak==0) {
                    continue;
                }
                System.out.println("Aradiginiz sayi yukarida");
            } else {
                System.out.println("Oyunu kazandiniz.");
                break;
            }


            System.out.println("Kalan hakkiniz: "+  hak);

        }while (hak>0);

        if (hak==0) {
            System.out.println("Hakkiniz bitmistir.");
        }
        puaniniz = puan* hak;
        System.out.println("Puaniniz: " + puaniniz);
        System.out.println("Aradiginiz Sayi: " + oyunSayisi);

    }

}

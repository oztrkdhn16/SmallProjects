package smallProject;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("Ikinci bir sayi giriniz");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int ekok = sayi1*sayi2;
        int ekokSayisi = 1;
        int ebobSayisi = 1;
        int enBuyukSayi = sayi1;
        int enKucukSayi = sayi2;

        if (enBuyukSayi<enKucukSayi) {
            enBuyukSayi = sayi2;
            enKucukSayi = sayi1;
        }

        for(int i = ekok; i>=enBuyukSayi; i--) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                ekokSayisi = i;
            }
        }

        for(int k = ebob; k<=enKucukSayi; k++){
            if(sayi1%k==0 && sayi2%k==0){
                ebobSayisi = k;

            }
        }
        System.out.println("Ekok: "+ekokSayisi);
        System.out.println("Ebob: "+ebobSayisi);

    }

}

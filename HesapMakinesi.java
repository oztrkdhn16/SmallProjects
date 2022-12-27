package smallProject;

import java.util.Scanner;

public class HesapMakinesi {


    //Kullanicinin girmis oldugu 2 sayinin toplam(+), cikarma(-), carpma(*), bolme(/) ve mod alma(%) islemini
    //farkli methotlardan cagirarak yapma

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz.");
        int sayi1 = input.nextInt();
        System.out.println("Ikinci sayiyi giriniz.");
        int sayi2 = input.nextInt();


        System.out.println("Girilen Sayilarin Toplami: "+ toplama(sayi1,sayi2));
        System.out.println("Girilen sayilarin Farki: " + cikarma(sayi1,sayi2));
        System.out.println("Girilen Sayilarin Carpimi: "+ carpma(sayi1,sayi2));
        System.out.println("Girilen Sayilarin Bolumu: "+ bolme(sayi1,sayi2));
        System.out.println("Girilen sayilarin modunu bulma: "+ modAlma(sayi1,sayi2));

    }

    private static int modAlma(int a, int b) {

        return a%b;
    }

    private static int bolme(int a, int b) {

        return a/b;
    }

    private static int carpma(int a, int b) {

        return a*b;
    }

    private static int cikarma(int a, int b) {

        return a-b;
    }

    private static int toplama(int a, int b) {

        return a+b;

    }


}

package tr_SYSO_1;

public class Soru07_SWAP {

    /*

        Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)

        int a= 3;

        int b= 5;

        Ornek Cikti:

        a=5

        b=3

     */
    public static void main(String[] args) {

        int sayi1 = 3;
        int sayi2 = 5;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        sayi1 = sayi1+sayi2; // 5+3 = 8
        sayi2 = sayi1-sayi2; // 8-5 = 3
        sayi1 = sayi1-sayi2; // 5

        System.out.println("Degisen Sayilar");

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

    }
}


package scanner;

import java.util.Scanner;

public class __Soru03_DikdortgenAlani_DikdortgenCevresi {

    /*

        Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını
        ve çevresini konsola yazdıran bir program yazın.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortenin birinci uzunlugunu giriniz");
        int kenar1 = input.nextInt();
        System.out.println("Dikdortenin ikinci uzunlugunu giriniz");
        int kenar2 = input.nextInt();

        System.out.println("Dikdortgenin Alani: " + dikdortgeninAlani(kenar1, kenar2));
        System.out.println("Dikdortgenin Cevresi: " + dikdortgeninCevresi(kenar1, kenar2));

    }

    public static int dikdortgeninCevresi(int kenar1, int kenar2){

        return 2*(kenar1+kenar2);

    }

    public static int dikdortgeninAlani(int kenar1, int kenar2){

        return kenar1*kenar2;

    }

}

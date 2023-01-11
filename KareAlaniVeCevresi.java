package scanner;

import java.util.Scanner;

public class Soru02_KareAlani_KareCevresi {

    /*

        Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Karenin bir kenar uzunlugunu giriniz");
        int kenar = input.nextInt();

        System.out.println("karenin Cevresi: " + kareninCevresi(kenar));
        System.out.println("karenin Alani: " + kareninAlani(kenar));


    }

    public static int kareninCevresi(int kenar){

        return kenar*4;

    }
    public static int kareninAlani(int kenar){

        return kenar*kenar;

    }
}

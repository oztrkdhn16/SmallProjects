package conditional_Statement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru11_SesliSessizHarfSorgulama {


    /*

        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada 1 karakterden
        fazla ise hata mesajı göstersin.

        Sesli harfler: a,e,i,o,u

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz?");
        String harf = input.next().toLowerCase();

        List<String> sesliHarfler = new ArrayList<>();
        sesliHarfler.add("a");
        sesliHarfler.add("e");
        sesliHarfler.add("i");
        sesliHarfler.add("o");
        sesliHarfler.add("u");

        String harflerHaricTumKarakterler = harf.replaceAll("[a-z]","").replaceAll("[A-Z]","");

        if (sesliHarfler.contains(harf)){
            System.out.println("Kullanicinin girdigi harf seslidir.");
        }else if(harflerHaricTumKarakterler.contains(harf)){
            System.out.println("Kullanicinin girdigi harf rakam veya baska karakter icermektedir");
        }else {
            System.out.println("Kullanicin girdigi harf sessiz harftir.");
        }



    }
}

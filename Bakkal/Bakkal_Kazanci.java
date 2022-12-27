package smallProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bakkal_Kazanci {
    
    /*
        * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
    */

    public static void main(String[] args) {

        List<String> gunler = new ArrayList<>();
        gunler.add("Pazar");
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");

        List<Integer> gunlukKazanclar = new ArrayList<>();
        int i = 0;

        while (i < gunler.size()) {
            Scanner input = new Scanner(System.in);
            System.out.println(gunler.get(i) + " gunun kazancini giriniz.");
            int kazanc = input.nextInt();

            gunlukKazanclar.add(kazanc);
            i++;
        }
        double average = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Ortalama Kazanc: " + average);
        List<String> ortalamaUstu = getOrtalamaninUstundeKazancGunleri(average, gunlukKazanclar, gunler);
        System.out.println("Ortalama Kazanc Ustundeki Gunler: "+ortalamaUstu);
        List<String> ortalamaAlti = getOrtalamaninAltindakiKazancGunleri(average, gunlukKazanclar, gunler);
        System.out.println("Ortalama Kazanc Altindaki Gunler: "+ortalamaAlti);


    }

    public static double getOrtalamaKazanc(List<Integer> gunlukKazanclar) {
        double sum = 0;
        for (int w : gunlukKazanclar) {
            sum += w;
        }
        System.out.println("Toplam Kazanc: " +sum);

        return sum / gunlukKazanclar.size();//average

    }

    public static List<String>  getOrtalamaninUstundeKazancGunleri(double average, List<Integer> gunlukKazanclar, List<String> gunler) {
        List<String> ortalamUstuGunler = new ArrayList<>();

        for (int i = 0; i<gunler.size(); i++) {
            if (average <= gunlukKazanclar.get(i)) {
                ortalamUstuGunler.add(gunler.get(i));
            }
        }
        return ortalamUstuGunler;

    }

    public static List<String>  getOrtalamaninAltindakiKazancGunleri(double average, List<Integer> gunlukKazanclar, List<String> gunler) {
        List<String> ortalamAltiGunler = new ArrayList<>();

        for (int i = 0; i<gunler.size(); i++) {
            if (average > gunlukKazanclar.get(i)) {
                ortalamAltiGunler.add(gunler.get(i));
            }
        }
        return ortalamAltiGunler;

    }
    
}

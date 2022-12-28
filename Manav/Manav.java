package aa_takim_odevleri.manav;

import java.util.*;

public class Manav {

    /*
    TASK -1:
            * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

           Ipucu:
           Class icinde 3 method olacak

         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method

    */
    static Scanner input = new Scanner(System.in);
    static Map<String,Double> hesap = new HashMap<>();

    public static void main(String[] args) {

        musteriSecimi();
        System.out.println(hesap+"\nToplam Odemeniz Gereken Miktar: "+araToplam);

    }
    static double araToplam = 0;
    public static void musteriSecimi(){

        Map<String, Double> urunler = new HashMap<>();
        urunler.put("Domates",3.45);
        urunler.put("Patates",7.55);
        urunler.put("Biber",4.48);
        urunler.put("Karpuz",3.69);
        urunler.put("Salatalik",6.45);

        boolean flag = true;
        double toplam = 0;

        do {

            System.out.println("Hangi urunu almak istiyorsunuz?\nDomates: 1\nPatates: 2\nBiber: 3\nKarpuz: 4\nSalatalik: 5\n");
            System.out.println("Urun isimleri ve fiyatlari: " + urunler.toString());
            int urunKodu = input.nextInt();

            double birimFiyat = 0;

            System.out.println("Kac kilo almak istersiniz");
            double kilo = input.nextDouble();

            switch (urunKodu){
                case 1:
                    birimFiyat = urunler.get("Domates");
                    toplam = kilo * birimFiyat;
                    kasa("Domates",toplam);
                    break;
                case 2:
                    birimFiyat = urunler.get("Patates");
                    toplam = kilo * birimFiyat;
                    kasa("Patates",toplam);
                    break;
                case 3:
                    birimFiyat = urunler.get("Biber");
                    toplam = kilo * birimFiyat;
                    kasa("Biber",toplam);
                    break;
                case 4:
                    birimFiyat = urunler.get("Karpuz");
                    toplam = kilo * birimFiyat;
                    kasa("Karpuz",toplam);
                    break;
                case 5:
                    birimFiyat = urunler.get("Salatalik");
                    toplam = kilo * birimFiyat;
                    kasa("Salatalik",toplam);
                    break;
                default:
                    System.out.println("Lutfen gecerli bir sayi giriniz");
                    musteriSecimi();
                    break;
            }

            araToplam += toplam;

            System.out.println("Ara Toplam: "+ araToplam);

            System.out.println("Cikmak istiyor musun? E / H");
            char ch = input.next().toLowerCase().charAt(0);

            if (ch == 'e'){
                flag = false;
            }

        }while (flag);
    }
    public static Map<String,Double> kasa(String urun, double birim){

        System.out.println(urun+" ---> "+birim);

        hesap.put(urun,birim);

        return hesap;

    }
}
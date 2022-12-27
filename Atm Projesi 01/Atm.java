package smallProject;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Sifrenizi olusturunuz.");
            String sifre = input.next();
            sifre = sifre.trim();

            boolean sifreUzunlugu = sifre.length()>7; //min 8 karakter olmali
            boolean rakam = sifre.replaceAll("[^0-9]","").length()>0;//en az bri rakam icermeli
            boolean buyukHarf = sifre.replaceAll("[^A-Z]","").length()>0;//en az bir buyuk harf icermeli
            boolean sembol = sifre.replaceAll("[a-zA-Z0-9 ]","").length()>0;//en az bir sembol icermeli

            if (sifreUzunlugu && rakam && buyukHarf && sembol) {
                System.out.println("Sifreniz olusturulmustur.");
                System.out.println("Sifreniz: " + sifre);
                break;
            }
            if (!sifreUzunlugu) {
                System.out.println("Sifreniz 8 karakterden azdir");
            }
            if (!rakam) {
                System.out.println("Sifreniz rakam icermemektedir");
            }
            if (!buyukHarf) {
                System.out.println("Sifreniz buyuk harf icermemektedir");
            }
            if (!sembol) {
                System.out.println("Sifreniz sembol icermemektedir");
            }

        }while (true);

        System.out.println("Yapmak istediginiz islem icin rakam giriniz.\n1: Para Cekme\n2: Para Yatirma");
        int sayi = input.nextInt();
        int hesaptaBulunanPara = 1000;

        switch (sayi){
            case 1:
                do {
                    System.out.println("Cekmek istediginiz miktari yaziniz.\nCikis Yapmak icin 0'a basiniz");
                    int cekilenPara = input.nextInt();
                    if(cekilenPara == 0) {
                        System.out.println("Cikis Gerceklesmistir.");
                        break;
                    } else if (hesaptaBulunanPara>=cekilenPara) {
                        hesaptaBulunanPara = hesaptaBulunanPara - cekilenPara;
                        System.out.println("Hesabinizda kalan miktar: " + hesaptaBulunanPara);
                    } else if (hesaptaBulunanPara<cekilenPara) {
                        System.out.println("Maalesef cekmek istediginiz miktar hesapta bulunandan az.");
                        System.out.println("Cekebileceginiz max para: " + hesaptaBulunanPara);
                    }
                }while (true);
                break;
            case 2:
                do {
                    System.out.println("Hesabiniza yatirmak istediginiz miktari giriniz.\nCikis Yapmak icin 0'a basiniz");
                    int yatirilanPara = input.nextInt();
                    if (yatirilanPara == 0) {
                        System.out.println("Cikis Gerceklesmistir.");
                        break;
                    }
                    hesaptaBulunanPara = hesaptaBulunanPara + yatirilanPara;
                    System.out.println("Hesabinizdaki Bulunan Para: " + hesaptaBulunanPara);

                }while (true);
                break;
            default:
                System.out.println("Gecersiz islem");
        }
    }
}

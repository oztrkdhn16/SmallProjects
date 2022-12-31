package if_Switch_Ternary_String_Tr;

import java.util.Scanner;

public class Soru05_ArtikYil_AydakiGunSayisiniHesaplama {

    /*

        Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

        //Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
        //Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yil giriniz");
        int yil = input.nextInt();
        System.out.println("Lutfen ayNo giriniz");
        int ay = input.nextInt();

        System.out.println("Yil: " + yil);

        switch (ay){

            case 1:
                System.out.println("Ocak: " + 31);
                break;
            case 2:
                if((yil % 100 == 0 && yil % 400==0) || (yil % 4 ==0)){
                    System.out.println("Artik Yil");
                    System.out.println("Subat: " + 29);
                }else {
                    System.out.println("Artik Yil Degildir");
                    System.out.println("Subat: " + 28);
                }
                break;
            case 3:
                System.out.println("Mart: " + 31);
                break;
            case 4:
                System.out.println("Nisan: " + 30);
                break;
            case 5:
                System.out.println("Mayis: " + 31);
                break;
            case 6:
                System.out.println("Haziran: " + 30);
                break;
            case 7:
                System.out.println("Temmuz: " + 31);
                break;
            case 8:
                System.out.println("Agustos: " + 31);
                break;
            case 9:
                System.out.println("Eylul: " + 30);
                break;
            case 10:
                System.out.println("Ekim: " + 31);
                break;
            case 11:
                System.out.println("Kasim: " + 30);
                break;
            case 12:
                System.out.println("Aralik: " + 31);
                break;
            default:
                System.out.println("Gecersiz ayNo girisi, Tekrar deneyiniz.");



        }

    }







}

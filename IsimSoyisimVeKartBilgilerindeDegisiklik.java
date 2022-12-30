package if_Switch_Ternary_String_Tr;

import java.util.Scanner;

public class Soru02_IsimSoyisim_KrediKartNo {

    /*

        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

        Input :

        John White

        1234234534561478

        Output : Name :

        J*** W****

        CCN  : **** **** **** 1478

        * Ilk Harfler Buyuk harf ile baslamalidir.

    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi ve Soyadinizi giriniz");
        String tamIsim = input.nextLine();

        System.out.println("Kredi Kart No giriniz");
        String no = input.next();

        int boslukIdx = tamIsim.indexOf(" ");

        String isim = tamIsim.substring(0,1).toUpperCase()+tamIsim.substring(1,boslukIdx).replaceAll("[a-z]","*") +
                   tamIsim.substring(boslukIdx,boslukIdx+2).toUpperCase()+tamIsim.substring(boslukIdx+2).replaceAll("[a-z]","*");

        String kimlik = no.substring(0,4).replaceAll("[0-9]","*")+ " " + no.substring(4,8).replaceAll("[0-9]","*")+ " " +
                no.substring(8,12).replaceAll("[0-9]","*")+ " " + no.substring(12);

        System.out.println(isim);
        System.out.println(kimlik);





    }


}

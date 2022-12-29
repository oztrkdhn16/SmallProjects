package if_Switch_Ternary_String_Tr;

import java.util.Scanner;

public class Soru01_VucutKitle_IndeksiniHesapla {

    /*

    Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

    IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

    BMI 18,5'in altındaysa zayıfsınız

    BMI 18,5 ile 25 arasında ise kilonuz idealdir

    BMI 25-30 arasındaysa şişmansınız

    BMI 30'dan büyük veya eşitse, obez

    Output:

    Agirlik : 71

    Boy : 1,72

    BMI : 23.99945916711736

    Zayifsiniz.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        int kilo = input.nextInt();
        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        Double BMI = kilo/ (boy*boy);

        if(BMI<18.5){
            System.out.println("Zayifsiniz");
            System.out.println(BMI);
        }else if(BMI<25){
            System.out.println("Idealsiniz");
            System.out.println(BMI);
        }else if(BMI<30){
            System.out.println("Sismansizini");
            System.out.println(BMI);
        }else if(30<=BMI){
            System.out.println("Obezsiniz");
            System.out.println(BMI);
        }else {
            System.out.println("Lutfen dogru bir sekilde istenenleri cevaplayiniz.");
        }




























    }




}

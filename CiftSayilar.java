package smallProject;

import java.util.ArrayList;
import java.util.List;

public class CiftSayilar {

    /*
       Bir List içerisine 0'dan 10'a rastgele 5 tam sayi atayan ve atanan çift sayıları "ciftSayi" String değerine
       dönüştüren bir kod yazınız. Eğer çift sayi içermezse "Cift Sayi Yoktur" yazdırın.

       Örn:[9, 7, 6, 5, 2]
           [9, 7, CiftSayi, 5, CiftSayi]
      */

    public static void main(String[] args) {

        addNumberOfRandom();

    }

    static void addNumberOfRandom(){
        List<Object> list = new ArrayList<>();

        for(int i = 0; i<5; i++){
            list.add((int) (Math.random() * 11));
        }
        System.out.println(list);

        for(int i = 0; i<list.size(); i++){
            if((int)list.get(i)%2==0){
                list.set(i,"CiftSayi");
            }
        }
        System.out.println(list);
        if(!list.contains("CiftSayi")){
            System.out.println("Cift Sayi Yoktur");
        }

    }

}

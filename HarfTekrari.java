package smallProject;

public class HarfTekrari {

    /*
    Girilen String'de hangi harfin kaç kere kullanıldığını yazan bir kod yazınız.

    Input: String str = "Merhaba Dunya";
    Output: String strOutput = "M1 e1 r1 h1 a3 b1 D1 u1 n1 y1 ";
     */

    public static void main(String[] args) {

        String str = "Merhaba Dunya";
        String[] arr = str.split("");
        String result = "";

        for(String w: arr){
            int count = 0;
            for(String u: arr){
                if(w.equals(u)){
                    count++;
                }
            }
            if(!result.contains(w)){
                result += w+count+" ";
            }

        }
        System.out.println(result);

    }

}

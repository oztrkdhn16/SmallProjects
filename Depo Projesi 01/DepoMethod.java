package depo2;


import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepoMethod extends Depo {
    static Scanner input = new Scanner(System.in);

    // urunTanimlama   ==> Urunun ismi, ureticisi ve birimi girilecek. id  alınacak.
    //
    // urunListele     ==> Tanimlanan urunler listelenecek. urunun adeti ve raf numarasi tanimlama yapilmadiysa
    //                     default deger gorunsun.
    //
    // urunGirisi      ==> Giris yapmak istedigimiz urnunun id numarasi ile girecegiz.
    //
    // urunuRafaKoy    ==> Listeden urunu sececegiz ve id numarasina gore urunu rafa koyacagiz.
    //
    // urunCikisi      ==> Listeden urunu sececegiz ve urunun cikis yapcagiz. burada urun listesinden sadece miktarda
    //                     degisiklik yapilacak.
    //                     Urun adedi 0dan az olamaz. 0 olunca urun tanimlamasi silinmesin. sadece miktari 0 olsun.

    //                 ==> Yaptigimiz tum degisiklikler listede de gorunsun.

    //                     String urunAdi,String uretici,String birim



    public  static  void menu(){

        do {
            System.out.println("*".repeat(20));
            System.out.println("1-urun tanimlama\n2-urungirisi\n3-urunrafakoy\n4-uruncikisi\n5-urunlistele\n6-cikis");
            System.out.println("*".repeat(20));
            System.out.print("Islem Seciniz: ");
            int secim = input.nextInt();
            if (secim==6){
                cikis();
                break;
            }
            switch (secim){
                case 1:
                    urunTanimlama();
                    break;
                case 2:
                    urunGirisi();
                    break;
                case 3:
                    rafaKoy();
                    break;
                case 4:
                    urunCikisi();
                    break;
                case 5:
                    urunListele();
                    break;
                default:
                    System.out.println("lutfen gecerli bir secim yapiniz");
            }

        }while (true);

    }
    public static void urunTanimlama() {


        input.nextLine();
        Boolean flag = true;
        do {
            System.out.print("Lutfen tanimlamak istadiginiz urun bilgilerini giriniz!\nUrun Adi: ");
            String urunAdi = input.nextLine();
            System.out.print("Uretici Adi :");
            String uretici = input.nextLine();
            System.out.print("Birim Cinsi: ");
            String birim = input.nextLine();

            if (urunler.isEmpty()){
                urunler.put(id, new Depo(urunAdi, uretici, birim));
                id++;
            }else {
                for (Map.Entry<Integer, Depo> w:urunler.entrySet()){
                    if (w.getValue().urunAdi.equals(urunAdi)&&
                            w.getValue().uretici.equals(uretici)&&
                            w.getValue().birim.equals(birim)){
                        System.out.println("Girdiginiz urun daha once tanimlanmis");

                    }else {
                        urunler.put(id, new Depo(urunAdi, uretici, birim));
                        id++;
                    }
                    flag=false;
                }
            }

            break;



        } while (flag);


    }

    public static void urunListele() {
        Depo d1 = new Depo();

        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%n", "id", "urunadi", "uretici", "birim", "miktar", "raf");

        for (Map.Entry<Integer, Depo> w : urunler.entrySet()) {
            System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%n", w.getKey(), w.getValue().urunAdi,
                    w.getValue().uretici, w.getValue().birim, w.getValue().miktar, w.getValue().rafNo);
        }


    }

    public static void urunGirisi() {
        System.out.print("Lutfen giris icin urun bilgilerini giriniz\nid:");
        Integer id = input.nextInt();

        if (urunler.containsKey(id)){
            System.out.print("miktar:");
            int miktar = input.nextInt();
            urunler.get(id).miktar+=miktar;

        }else {
            System.out.println("gecersiz id girdiniz. once urun tanimlayiniz");
            menu();
        }


    }


    public static void rafaKoy() {
        System.out.println("Rafa koymak icin Urun bilgilerini giriniz");
        System.out.print("ID: ");
        Integer id = input.nextInt();
        if (urunler.containsKey(id)){
            System.out.print("rafno: ");
            char rafno = input.next().charAt(0);
            urunler.get(id).rafNo=rafno;

        }else {
            System.out.println("gecersiz id girdiniz. once urun tanimlayiniz");
            menu();
        }

    }


    public static void urunCikisi() {
        System.out.println("Cikis icin urun bilgileri giriniz");
        System.out.print("ID: ");
        Integer id = input.nextInt();
        if (urunler.get(id).rafNo==0){
            System.out.println("Malesef bu urun rafta bulunmuyor");
        }else {
            if (urunler.containsKey(id)) {
                System.out.print("miktar: ");
                int cmiktar = input.nextInt();

                if (cmiktar > urunler.get(id).miktar) {
                    System.out.println("yeterli urun yok.lutfen miktari  en fazla " + urunler.get(id).miktar + "   olarak giriniz");
                    urunCikisi();
                } else {
                    urunler.get(id).miktar -= cmiktar;
                }

            } else {
                System.out.println("gecersiz id girdiniz. once urun tanimlayiniz");
            }
        }
    }
    public static void cikis(){
        System.out.println("program sonlandiriliyor...");
    }
}

package smallProject.kutuphane;

public class Kitaplar {

    public static void main(String[] args) {

        Kitap_Ozellilleri kitap1 = new Kitap_Ozellilleri("Yeraltindan Notlar","Dostoyevski",139);
        kitap1.kitapBilgileri();
        Kitap_Ozellilleri kitap2 = new Kitap_Ozellilleri("Insan Neyle Yasar","Tolstoy",86);
        kitap2.kitapBilgileri();
        Kitap_Ozellilleri kitap3 = new Kitap_Ozellilleri("Ruhun Tutkulari","Descartes",132);
        kitap3.kitapBilgileri();

    }

}

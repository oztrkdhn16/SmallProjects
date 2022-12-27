package smallProject.kutuphane;

public class Kitap_Ozellilleri {

    String kitapIsmi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNo;
    static int kitapSayisi;

    public Kitap_Ozellilleri(String kitapIsmi, String yazarAdi, int sayfaSayisi) {
        this.kitapIsmi = kitapIsmi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        kitapSayisi++;
        this.seriNo = yazarAdi.substring(0,2) + kitapIsmi.substring(0,3) + kitapSayisi;
    }

    public void kitapBilgileri(){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Kitap Ismi: " + kitapIsmi + "\nYazar Ismi: " + yazarAdi + "\nSayfa Sayisi: " + sayfaSayisi + "\nSeri Numarasi: " + seriNo);
        System.out.println("-------------------------------------------------------------------");
    }

}
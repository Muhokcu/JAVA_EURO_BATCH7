package gunler.gun44_09_01_2023_Static_Members_1;

public class HesapMakinasiTest6 {
    public static void main(String[] args) {
      /*  HesapMakinasi5 hspn1 = new HesapMakinasi5();
        hspn1.topla(5,6);
        System.out.println("hspn1 = " + hspn1);*/
        HesapMakinasi5.topla(12,56);
        HesapMakinasi5.topla(2,20,5,5,5,5,5,5,53,3,5,2);
       // System.out.println("HesapMakinasi5.sonuc = " + HesapMakinasi5.sonuc); diger classda 0 ladigimiz icin burda iptal ettik

       //HesapMakinasi5.sonuc=0; // diger classda 0 ladigimiz icin burda iptal ettik
        System.out.println("Math.sqrt(12) = " + Math.sqrt(12));

        HesapMakinasi5.topla(12,33,55,44,99,7799,77,5554,555433);
       // System.out.println("HesapMakinasi5.sonuc = " + HesapMakinasi5.sonuc);//diger classda 0 ladigimiz icin burda iptal ettik

        Ogrenci3 ogrenci1 = new Ogrenci3("Ahmet");
        Ogrenci3 ogrenci2 = new Ogrenci3("Ali");
        Ogrenci3 ogrenci3 = new Ogrenci3("Hasan");
        Ogrenci3 ogrenci4 = new Ogrenci3("Mehmet");
        Ogrenci3 ogrenci5 = new Ogrenci3("Mustafa");
        Ogrenci3 ogrenci6 = new Ogrenci3("Hatice");
        HesapMakinasi5.ogrenciEkle(ogrenci1,ogrenci2,ogrenci3,ogrenci4);//Passing variable numbers of arguments type Ogrenci

    } // kontrol et

}

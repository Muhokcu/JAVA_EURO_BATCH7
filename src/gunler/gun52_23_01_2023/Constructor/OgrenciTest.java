package gunler.gun52_23_01_2023.Constructor;

public class OgrenciTest {
    public static void main(String[] args) {


        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.setAd("Ahmet");
        ogrenci1.setSoyAd("Falanca");
        ogrenci1.setOkulNo(1234);

        Ogrenci ogrenci2 = new Ogrenci("Mehmet", "Filanca", 432);
        Ogrenci ogrenci3 = new Ogrenci("Hasan", "Filanca", 45567);
        Ogrenci ogrenci4 = new Ogrenci("Can", "Filanca", 667);
        Ogrenci ogrenci5 = new Ogrenci("Ayse", "Filanca", 123456);


    }
}

package gunler.gun44_09_01_2023;

public class HesapMakinasi5 {
    static double sonuc;
    static void topla(int sayiA, int sayiB){
        sonuc=sayiA+sayiB;
        System.out.println("sonuc = " + sonuc);
        sonuc=0;
    }
    public static void topla(int... sayi){ // var args methodu 3 nokta koyarsan kac sayi olusa toplar
        System.out.println(sayi.length);
        for (int i = 0; i< sayi.length;i++){
            System.out.println("i = " + sayi[i]);
            sonuc+=sayi[i];

        }
        System.out.println("sonuc = " + sonuc);
        sonuc=0;
    }
    public static void ogrenciEkle(Ogrenci3... ogrenciler){
        for (Ogrenci3 eleman : ogrenciler){
            System.out.println("eleman = " + eleman);
        }
    }



}

package gunler.gun28_02_12_2022;

public class MerkezBankasi {
    public static void main(String[] args) {
        Banka musteri = new Banka();
        musteri.hesapSAhibi = "Ali Ates";
        musteri.hesapNumarasi = 1111111111;

        System.out.println(musteri.bakiye);
        System.out.println(musteri.bankaAdi);

        musteri.paraYatir(25000.00);
        musteri.paraCek(12000.00);
        musteri.paraCek(20000.00);
        musteri.satinAl("Iphone", 1000);
        musteri.bakiyeGoster();
        musteri.satinAl("Bmw", 30000);
        musteri.paraCek(123);
        musteri.bakiyeGoster();

        System.out.println("-------------");

        Banka musteri2 = new Banka();
        musteri2.hesapSAhibi = "Ayse Hanim";
        musteri2.hesapNumarasi = 1000000000;
        musteri2.paraYatir(50000);
        musteri2.paraCek(2000);
        musteri2.satinAl("Ayakkabi", 2500);
        musteri2.bakiyeGoster();
        musteri2.bankaAdi = "Bank Of England";
        musteri.bakiyeGoster();
        musteri2.bakiyeGoster();
    }
}

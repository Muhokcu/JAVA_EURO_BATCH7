package gunler.gun41_03_01_2023_Constructor_1.Banka;

public class BankaProgram {
    public static void main(String[] args) {
        Musteri musteri1 = new Musteri();
        musteri1.showInfo();
        Musteri musteri2 = new Musteri();
        musteri2.showInfo();


        Musteri musteri3 = new Musteri("Mehmet John", 12345, 34567, 903456789, 5000);
        musteri3.showInfo();

        Banka banka = new Banka("ABC International Bank", "Berlin/Germany");
        banka.musteriEkle(musteri3);
        banka.musteriEkle(musteri2);
        banka.musteriEkle(musteri1);

        banka.paraCek(musteri3, 1500);
        banka.paraCek(musteri3, 1500);
        banka.paraCek(musteri3, 2500);

        //  banka.showInfo();

    }
}




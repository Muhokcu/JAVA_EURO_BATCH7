package gunler.gun54_25_01_2023.Bilgisayar;

public class D7BilgisayarTest {

    public static void main(String[] args) {
        D1Boyut boyut = new D1Boyut(35.5, 15.3, 20.8);
        D3Kasa kasa = new D3Kasa("Nirvana", "Dell", "Elektrik", boyut);
        D4Monitor monitor = new D4Monitor("5500", "LG", 23, new D2Cozunurluk(1980, 1080));
        D5Anakart anakart = new D5Anakart("S345", "Intel", 4, 2, "v1.2");

        D6Bilgisayar bilgisayar = new D6Bilgisayar(anakart, monitor, kasa);
        bilgisayar.getKasa().calistir();
        System.out.println("bilgisayar.getMonitor().getEkranBoyutu() = " + bilgisayar.getMonitor().getEkranBoyutu());
        bilgisayar.getAnakart().programyukle("Word");
        System.out.println("bilgisayar.toString() = " + bilgisayar.toString());


    }
}

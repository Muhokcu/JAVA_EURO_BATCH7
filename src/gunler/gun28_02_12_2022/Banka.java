package gunler.gun28_02_12_2022;

public class Banka {
    String hesapSAhibi;
    long hesapNumarasi;
    double bakiye;
    //String bankaAdi = "EuroTechBank";// static ile statik olmayan farki iyi anla
    static String bankaAdi = "EuroTechBank";


    public void paraYatir(double miktar) {
        bakiye += miktar;
        System.out.println(hesapNumarasi + " nolu hesabiniza " + miktar + " Tl miktarda para yatirilmistir");

    }

    public void paraCek(double miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(hesapNumarasi + " nolu hesabiniza " + miktar + " TL miktarda para cekilmistir");
        } else {
            System.out.println("Uzugunum hesabinizda yeterli bakiye bulumamaktadir...");
        }

    }

    public void satinAl(String urunIsmi, double fiyat) {
        if (fiyat <= bakiye) {
            bakiye -= fiyat;
            System.out.println(urunIsmi + " isimli urun icin " + fiyat + " Tl kadar odeme yapilmistir");

        } else {
            System.out.println("Urun fiyati icin bakiyeniz yeterli degildir");

        }
    }

    public void bakiyeGoster() {
        System.out.println(" ----------------");
        System.out.println("Banka Adi : " + bankaAdi);
        System.out.println("Hesap Sahibi : " + hesapSAhibi);
        System.out.println("Hesap Numarasi " + hesapNumarasi);
        System.out.println("Bakiyeniz " + bakiye);
        System.out.println("--------------");
    }

}

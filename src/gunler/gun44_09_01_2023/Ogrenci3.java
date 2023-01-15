package gunler.gun44_09_01_2023;

public class Ogrenci3 {

    static int okulNo = 1000;
    String adi;
    int ogrNo;
    final static String okulAdi = "EuroTech Study";// sabit hale getirdik
    final static String okulAdresi = "Germany";

    public Ogrenci3(String adi) {
        okulNo++;
        this.ogrNo=okulNo;
        this.okulNo = okulNo;
        this.adi = adi;
        // this.okulAdi = okulAdi;
        //this.okulAdresi = okulAdresi;
    }


    @Override
    public String toString() {
        return "Ogrenci3{" +
                "okulNo=" + ogrNo +
                ", adi='" + adi + '\'' +
                ", okulAdi='" + okulAdi + '\'' +
                ", okulAdresi='" + okulAdresi + '\'' +
                '}';
    }
}

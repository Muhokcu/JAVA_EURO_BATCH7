package gunler.gun45_10_01_2023.Market;

import gunler.gun45_10_01_2023.Araba;

public class Urun {
    String urunAdi;
    double birimFiyati;
    double miktar;
    String kategori;
    double toplamFiyat;

    public Urun(String urunAdi, double birimFiyati, double miktar, String kategori) {
        this.urunAdi = urunAdi;
        this.birimFiyati = birimFiyati;
        this.miktar = miktar;
        this.kategori = kategori;
    }

    public double getToplamFiyat() {
        this.toplamFiyat = birimFiyati * miktar;
        return toplamFiyat;
    }

    public String toSTring() {
        String str = "";
        str += urunAdi + " " + birimFiyati + " " + " " + miktar + " " + getToplamFiyat();
        return str;
    }

    public static void main(String[] args) {
        Urun urun1 = new Urun("Elma", 15, 3, "Yiyecek");

    }
}

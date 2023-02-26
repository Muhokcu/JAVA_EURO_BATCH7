package gunler.gun45_10_01_2023_Static_Members_2.Market;

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
        str += "\t" + urunAdi + " \t\t\t" + birimFiyati + " \t\t" + miktar + " \t\t" + getToplamFiyat() + "\t\t" + kategori;
        return str;
    }

}
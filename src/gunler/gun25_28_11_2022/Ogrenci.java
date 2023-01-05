package gunler.gun25_28_11_2022;

public class Ogrenci {
    public static void main(String[] args) {
        // ogrenciNotuYazdir(120, 80); ---> ogrenci numarasi  , ogrencinin aldigi not

        // ogrenci numarasindan isme ulasacagiz
        // switch kullanacagiz metot isim dondurecek

        //100  ronaldo 110 messi 120 Ali 130

        ogrenciNotunuYazdir(120, 70);
        String yuzNoluOgrenci= ogrenciNotunuYazdir(100, 90);
        System.out.println("yuzNoluOgrenci = " + yuzNoluOgrenci);
    }

    static String ogrenciNotunuYazdir(int ogrenciNumarasi, int ogrenciNotu) {
        String ogrenciAdi = ogrenciIsmi(ogrenciNumarasi);
        char derece = notDerecesi(ogrenciNotu);
        // Ronaldo aldiniz notun karsili = B
        String sonuc = ogrenciAdi + " aldiginiz notun karsiligi = " + derece;
        //   System.out.println("sonuc = " + sonuc);
        return sonuc;
    }


    public static char notDerecesi(int not) {
        if (not <= 100 && not >= 80) {
            return 'A';
        } else if (not < 80 && not >= 60) {
            return 'B';
        } else {
            return 'C';
        }
    }

    public static String ogrenciIsmi(int ogrenciNumarasi) {
        switch (ogrenciNumarasi) {
            case 100:
                return "Ronaldo";
            case 110:
                return "Messi";
            case 120:
                return "Ali";
            case 130:
                return "Fatma";
            case 140:
                return "Ayse";
            default:
                System.out.println("aradiginiz isim bulunamadigi icin pele dedik");
                return "Pele";
        }
    }
}

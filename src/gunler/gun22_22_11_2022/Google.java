package gunler.gun22_22_11_2022;

public class Google {
    public static void main(String[] args) {

        //Google a git
        //Arama yap
        //urunu bul sitesine git
        //urunu sepete ekle
        //odeme yap
        //onay kjodu al
        //odemeyi tamamla
        //google a geri don
        System.out.println("Teste basla");
        google();
        System.out.println("Testi bitir");
    }

    public static void google() {
        System.out.println("Google Sitesine Gidildi");
        aramaYap();
    }

    public static void aramaYap() {
        System.out.println("Urun Aratildi");
        System.out.println("Urun Bulundu");

        urunSitesineGit();
    }

    public static void urunSitesineGit() {
        System.out.println("Urun Sitesine Gidildi");
        System.out.println("Urun Secildi");
        sepeteEkle();
    }

    public static void sepeteEkle() {
        System.out.println("Urun Sepete Eklendi");
        odemeYap();


    }

    static public void odemeYap() {
        System.out.println("Hesap Bilgileri Girildi");
        onayKoduAl();
        System.out.println("Onay Kodu Girildi");
        System.out.println("Odeme Tamamlandi");
        System.out.println("Google Geri Donuldu");
    }


    public static void onayKoduAl() {
        System.out.println("Onay Kodu Alindi");
    }
}


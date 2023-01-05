package gunler.gun24_25_11_2022;

public class Yas {
    public static void main(String[] args) {
        //        ya$Hesaplama(1970);
//        onsekizYas(1999);// 18 yas ustunde ise true dondurun
        String oyVerebilme = oyVerebilmeEhliyeti(2010);// isim ekleyerek
        String oyVerebilme2 = oyVerebilmeEhliyeti(2000);
        System.out.println("oyVerebilme = " + oyVerebilme);
        System.out.println("oyVerebilme2 = " + oyVerebilme2);
        //numaranin prime(asal) olup olmadigini gosteren bir metot yazalim true false
        // bir metot yazalim paramrede bir int sayi alalim busa yi kac asal sayi yazdiracagimi belirlesin
//        asalSayilariYazdir(20);// ilk 20 asal sayiyi yazdiracak
//        asalSayilariYazdir(10);// ilk 10 asal sayiyi yazdiracak
//        asalSayilariYazdir(30);// ilk 30 asal sayiyi yazdiracak

    }

    public static String oyVerebilmeEhliyeti(int dogumYili) {
        boolean oyVerebilir = onsekizYas(dogumYili);
        String sonuc = "";
        if (oyVerebilir) {
            sonuc = "Oy kullanabilirsiniz";
        } else {
            sonuc = "Oy kullanamazsiniz, 18 yasini beklemeniz gerekir.";
        }
        return sonuc;
    }

    public static boolean onsekizYas(int dogumYili) {
        // 18 yas ustunde ise true degil ise false
        int yas = ya$Hesaplama(dogumYili);
        boolean onsekizmi = true;
        if (yas > 18) {
//            return true;
            onsekizmi = true;
        } else {
//            return false;
            onsekizmi = false;
        }
        return onsekizmi;
    }

    public static int ya$Hesaplama(int dogumYili) {
        int yas = 2022 - dogumYili;
        return yas;
    }
}

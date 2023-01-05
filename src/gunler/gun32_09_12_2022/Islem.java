package gunler.gun32_09_12_2022;

public class Islem {
    public void buyukSayiBulalim(int a, int b) {
        if (a > b) {
            System.out.println("buyuk sayi =" + a);
        } else {
            System.out.println("buyuk sayi =" + b);
        }

    }

    public int kucukSayiyiBulalim(int numara, int sayi) {
        int kucukSayi = 0;
        if (numara < sayi) {
            System.out.println("kucuk sayi = " + numara);
            kucukSayi = numara;
        } else {
            System.out.println("kucuk sayi =" + sayi);
            kucukSayi = sayi;
        }
        return kucukSayi;
    }

    public int sayiGonder() {

        return 100;


    }

}

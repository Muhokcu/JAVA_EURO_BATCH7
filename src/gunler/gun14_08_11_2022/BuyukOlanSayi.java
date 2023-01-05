package gunler.gun14_08_11_2022;

public class BuyukOlanSayi {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, d = 115;
        int enBuyukSayi = 0;
        if (a > b && a > b && a > c && a > d) {
            enBuyukSayi = a;

        } else if (b > c && b > d) {
            enBuyukSayi = b;
        } else if (c > d) {
            enBuyukSayi = c;

        } else {
            enBuyukSayi = d;
        }

        System.out.println("en buyuk sayi : " + enBuyukSayi);
    }


}
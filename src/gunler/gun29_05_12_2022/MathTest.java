package gunler.gun29_05_12_2022;

public class MathTest {
    public static void main(String[] args) {
        Matematik matematik = new Matematik();
        Matematik.yazdir();// metot statik ise class ismi ile metoda ulasiyoruz
        System.out.println(Math.min(10, 20));//minimum sayi
        int max = Math.max(50, 5000);
        System.out.println("max = " + max);
        System.out.println(Math.max(55.59, 80));
        System.out.println("Math.pow(3,3) = " + Math.pow(3, 3));// ussu
        System.out.println("Math.abs(-20) = " + Math.abs(-20));//mutlak deger
        System.out.println("Math.floor(55.88) = " + Math.floor(55.88));
        System.out.println("Math.ceil(60.258) = " + Math.ceil(60.258));
        // Math.min
        // 100  200 30
        int a = 100;
        int b = 200;
        int c = 30;
        int kucukSayi = Math.min(a, b);
        kucukSayi = Math.min(kucukSayi, c);
        System.out.println("kucukSayi = " + kucukSayi);
        kucukSayi = Math.min(Math.min(a, b), c);
        System.out.println("kucukSayi = " + kucukSayi);

        double donenKucukSayi = kucukSayiHangisi(500, 100, 150);
        System.out.println("donenKucukSayi = " + donenKucukSayi);

    }

    public static double kucukSayiHangisi(int a, int b, int c) {
        return Math.min(c, Math.min(a, b));
    }
}

package gunler.gun25_28_11_2022;

public class Methotlar {
    public static void main(String[] args) {
        System.out.println(kucukSayi(10, 20));
        if (kucukSayi(6, 20) % 2 == 0) {
            System.out.println("sayi cift bir sayidir");
        }
        int numara = kucukSayi(500, 200);
        System.out.println("numara = " + numara);
    }

    public static int kucukSayi(int a, int b) {
        int min = 0;
        if (a < b) {
            return a;
        } else if (a == b) {
            return 0;
        } else {
            return b;
        }
    }
}

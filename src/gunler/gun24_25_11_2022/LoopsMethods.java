package gunler.gun24_25_11_2022;

public class LoopsMethods {
    public static void main(String[] args) {
        // 2 int parametreli
        // 1 baslangic 1 bitis sayisi veriliyor
        sayilariYazdir(100, 150);
        sayilariYazdir(10, 50);
        sayilariYazdir(40, 80);
        sayilarinToplami(10, 50);
        int sayiToplami20_70= sayilarinToplami(20, 70);
        System.out.println("sayiToplami20_70 = " + sayiToplami20_70);
    }

    public static int sayilarinToplami(int a, int b) {
        int toplam = 0;
        for (int i = a; i < b; i++) {
            toplam = toplam + i;
        }
        return toplam;
    }

    public static void sayilariYazdir(int baslangic, int son) {
        for (int i = baslangic; i <= son; i++) {
//            System.out.print(i+" ");
            System.out.printf("%5d", i);
        }
        System.out.println();
    }
}

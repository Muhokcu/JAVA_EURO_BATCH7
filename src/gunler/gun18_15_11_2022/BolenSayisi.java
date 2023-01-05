package gunler.gun18_15_11_2022;

public class BolenSayisi {
    public static void main(String[] args) {
        // 1 den 100e kadar olan sayilardan 7 ye bir kalanli bolunen sayilarin kac tane oldugu bulunuz
        int sayac = 0;
        int i = 7;
        for (i = 7; i <= 100; i++) {
            if (i % 7 == 1) {
                System.out.println("i : " + i);
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}

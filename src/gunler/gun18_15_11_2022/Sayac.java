package gunler.gun18_15_11_2022;

public class Sayac {
    public static void main(String[] args) {
        int sayac = 0;
        for (int i = 0; i < 1110; i++) {
            if (i % 7 == 5)
                sayac++;
        }
        System.out.println("sayac = " + sayac);
    }
}

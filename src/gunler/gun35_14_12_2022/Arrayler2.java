package gunler.gun35_14_12_2022;

public class Arrayler2 {
    public static void main(String[] args) {
        String[] sehirler = {"Istanbul", "Trabzon", "Agri", "Mardin", "Antalya" };
        String ist = sehirler[0];
        for (String sehir : sehirler) {
            System.out.println("sehir = " + sehir);
        }
        int[] sayilar = {100, 2, 5, 100, 20, 30, 40, 100, 150};
        for (int sayi : sayilar) {
            System.out.println(sayi);

        }
        int i = 0;
        for (String sehir : sehirler) {
            i++;
        }
        System.out.println("i = " + i);
        System.out.println("sehirler.length = " + sehirler.length);
        int sayac = 0;
        for (int n : sayilar) {
            if (n > 50) {
                System.out.println("n = " + n);
                sayac++;


            }

        }
        System.out.println("sayac = " + sayac);
    }
}

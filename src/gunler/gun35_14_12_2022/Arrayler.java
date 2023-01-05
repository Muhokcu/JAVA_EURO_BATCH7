package gunler.gun35_14_12_2022;

import java.util.Arrays;

public class Arrayler {
    public static void main(String[] args) {
        int[] sayilar;
        sayilar = new int[5]; // indeks numarasi 0 dan basliyor
        sayilar[0] = 1;
        sayilar[3] = 4;
        sayilar[4] = 5;
        String[] sehirler = {"Istanbul", "Edirne", "Mardin", "Artvin", "Trabzon" };
        double[] duble = new double[]{0.5, 2.8, 3, 8, 10, 20};
        System.out.println("sayilar.length = " + sayilar.length);
        System.out.println("sehirler.length = " + sehirler.length);
        System.out.println("duble.length = " + duble.length);
        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));
        System.out.println("Arrays.toString(sehirler) = " + Arrays.toString(sehirler));
        System.out.println("sehirler[0] = " + sehirler[0]);
        System.out.println("sayilar[0] = " + sayilar[0]);
        sayilar[0] = 10;//bu sekilde yeni atama yaparak degistiebiliriz
        System.out.println("sayilar[0] = " + sayilar[0]);
        for (int i = 0; i < sehirler.length; i++) {
            System.out.println("sehirler[i] = " + sehirler[i]);
        }

    }
}

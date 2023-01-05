package gunler.gun37_19_12_2022;

import java.util.Arrays;

public class D1Arrayler {
    public static void main(String[] args) {
        int numara = 50;
        int[] numaralar = new int[5];
        numaralar[0] = 10;
        numaralar[1] = numara;//50
        numaralar[2] = 30;
        numaralar[3] = 40;
        numaralar[4] = 100;

        System.out.println(numaralar[0]);
        System.out.println("numaralar[4] = " + numaralar[4]);
        System.out.println(numaralar.length);//
        System.out.println("numaralar[4] = " + numaralar[numaralar.length - 1]);

        int aliSinavSonuclari[] = {90, 80, 70, 80, 100};

        System.out.println("aliSinavSonuclari.length = " + aliSinavSonuclari.length);
        System.out.println(aliSinavSonuclari[0]);
        System.out.println(aliSinavSonuclari[1]);
        System.out.println(aliSinavSonuclari[2]);
        System.out.println(aliSinavSonuclari[3]);
        System.out.println(aliSinavSonuclari[4]);
        for (int i = 0; i < 5; i++) {
            System.out.println(aliSinavSonuclari[i]);
        }
        System.out.println("for each");
        for (int sonuc : aliSinavSonuclari) {
            System.out.println("sonuc = " + sonuc);
        }

        //               mat    fizik      edebiyat    kimya    fransizca
        //     ali       90      80           70         80         100
        //     veli      80      100          90         85          90
        //    Ayse       85       90          100        90         95

        int[] velininNotlari = {80, 100, 90, 85, 90};
//        velininNotlari[0] ilk elemente ulasmak icin
        int[] sinavSonuclari[] = {
                {90, 80, 70, 80, 100},// ilk element indeks 0
                {80, 100, 90, 85, 90},//
                {85, 90, 100, 90, 95, 100, 80}// indeks 2
                , {10}
        };
        System.out.println(sinavSonuclari[0][1]);
        System.out.println("sinavSonuclari[1][2] = " + sinavSonuclari[1][2]);
        System.out.println("sinavSonuclari[2][2] = " + sinavSonuclari[2][2]);
        System.out.println("sinavSonuclari.length = " + sinavSonuclari.length);

        System.out.println("Arrays.toString(velininNotlari) = " + Arrays.toString(velininNotlari));
        System.out.println("Arrays.deepToString(sinavSonuclari) = " + Arrays.deepToString(sinavSonuclari));
        System.out.println("Arrays.toString(sinavSonuclari[1]) = " + Arrays.toString(sinavSonuclari[1]));

    }
}

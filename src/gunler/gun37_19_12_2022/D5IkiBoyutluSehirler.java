package gunler.gun37_19_12_2022;

import java.util.Arrays;

public class D5IkiBoyutluSehirler {
    public static void main(String[] args) {

        //    Istanbul Edirne    Erzurum  Mus       Adana
//    Berlin   Munih     Bremen   Hamburg
//    Londra   Manchstr  Leed

        String[] sehirler[] = {
                {"Istanbul", "Edirne", "Erzurum", "Mus", "Adana"},// indeks no 0
                //   0          1         2         3       4
                {"Berlin", "Munih", "Bremen", "Hamburg"},//  indeks 1
                //  0         1         2          3
                {"Londra", "Manchester", "Leeds"}// indeks 2
                //  0           1           2
        };
        System.out.println("sehirler.length = " + sehirler.length);// 3 tane elementi-object var
        System.out.println("sehirler[0][3] = " + sehirler[0][3]);//mu$
        System.out.println("sehirler[0].length = " + sehirler[0].length);
        System.out.println("sehirler[1][1] = " + sehirler[1][1]);//munih
        System.out.println("sehirler[1].length = " + sehirler[1].length);
        System.out.println("sehirler[2][2] = " + sehirler[2][2]);
        System.out.println("Arrays.toString(sehirler[2]) = " + Arrays.toString(sehirler[2]));
        System.out.println("Arrays.toString(sehirler[0]) = " + Arrays.toString(sehirler[0]));

//        for (int i = 0; i < 3; i++) {
        for (int i = 0; i < sehirler.length; i++) {
            System.out.println("Arrays.toString(sehirler[i]) = " + Arrays.toString(sehirler[i]));
        }
//        {"Istanbul", "Edirne", "Erzurum", "Mus", "Adana"},// indeks no 0
//        //   0          1         2         3       4
//        {"Berlin", "Munih", "Bremen", "Hamburg"},//  indeks 1
//        //  0         1         2          3
//        {"Londra", "Manchester", "Leeds"}// indeks 2
        for (int i = 0; i < sehirler.length; i++) {//satir sayisi ve arraye ulasiyoruz
            for (int n = 0; n < sehirler[i].length; n++) {// sutun sayisi
                System.out.print(" " + sehirler[i][n]);
            }
            System.out.println();// her satirdan sonra bir enter tusuna basaar
        }
        int[] sayilar = {1, 5, 7, 10, 20};
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }
        System.out.println("Arrays.deepToString(sehirler) = " + Arrays.deepToString(sehirler));

    }
}

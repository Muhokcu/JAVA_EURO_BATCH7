package gunler.gun34_13_12_2022;

import java.util.Scanner;

public class D4_Aylar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Dogdugunuz ayi rakam olarak giriniz = ");
        int ay = sc.nextInt();

        String[] aylar = new String[12];

        aylar[0] = "Ocak";
        aylar[1] = "Subat";
        aylar[2] = "Mart";
        aylar[3] = "Nisan";
        aylar[4] = "Mayis";
        aylar[5] = "Haziran";
        aylar[6] = "Temmuz";
        aylar[7] = "Agustos";
        aylar[8] = "Eylul";
        aylar[9] = "Ekim";
        aylar[10] = "Kasim";
        aylar[11] = "Aralik";

        System.out.println("Kulanicinin dogdugu ay = " + (aylar[ay - 1]));

    }
}

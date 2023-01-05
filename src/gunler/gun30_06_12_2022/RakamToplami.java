package gunler.gun30_06_12_2022;

import java.util.Scanner;

public class RakamToplami {
    public static void main(String[] args) {
     //   int sonuc =rakamTopla();

    }

    public static void rakamTopla() {
        Scanner sc= new Scanner(System.in);
        int sayi=sc.nextInt();
        int rakam;
        int toplamRakam = 0;
        while (sayi != 0) {
            rakam = sayi % 10;
            toplamRakam += rakam;
            sayi /= 10;

        }
       // return toplamRakam;
    }
}

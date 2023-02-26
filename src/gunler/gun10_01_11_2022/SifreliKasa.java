package gunler.gun10_01_11_2022;

import java.sql.SQLOutput;

public class SifreliKasa {

    public static void main(String[] args) {

        /*
        Uc sifre ile acilan bir kasa programi yazin
        Verdiginiz degerlere gore kasanin acilip acilmadigini
        Consolda yazdirin
         */

        System.out.println("Lutfen Sifrenizi Girin!");

        boolean sifre1 = true;
        boolean sifre2 = true;
        boolean sifre3 = true;

        boolean kasaAcildi;
        kasaAcildi = sifre1 && sifre2 && sifre3;

        System.out.println("kasaAcildi mi = " + kasaAcildi);

    }
}

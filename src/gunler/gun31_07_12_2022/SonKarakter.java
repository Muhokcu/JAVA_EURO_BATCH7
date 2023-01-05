package gunler.gun31_07_12_2022;

import java.util.Scanner;

public class SonKarakter {
    public static void main(String[] args) {
        // Kullanicidan aldiginiz bir Stringin son karakterini dinamik olarak bulan bir method yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Bir String giriniz!");
        String str = input.nextLine();

        char sonKarakter = lastIndex(str);
        System.out.println("sonKarakter = " + sonKarakter);

    }

    public static char lastIndex(String str) {
        return str.charAt(str.length() - 1);

    }
}
//  ONEMLI BIR FORMUL
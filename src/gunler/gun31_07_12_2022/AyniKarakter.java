package gunler.gun31_07_12_2022;

import java.util.Scanner;

public class AyniKarakter {
    public static void main(String[] args) {
        String kelime = "adapazari";
        char karakter = 'a';
        int tekrarSayisi = tekrarSayisi(kelime, karakter);
        System.out.println(karakter + " karakteri " + kelime + " icerisinde " + tekrarSayisi + " kez tekrar edilmektedir");
    }

    public static int tekrarSayisi(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }
}

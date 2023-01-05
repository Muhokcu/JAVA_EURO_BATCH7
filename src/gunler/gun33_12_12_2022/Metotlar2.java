package gunler.gun33_12_12_2022;

import java.util.Locale;

public class Metotlar2 {
    public static void main(String[] args) {
        String sehir = "Istanbul";
        //              01234567
        //                tanbul
        System.out.println("sehir.substring(1) = " + sehir.substring(2));
        String ilce = "Bodrum";
        //             012345
        System.out.println("ilce.substring(3) = " + ilce.substring(3));
        System.out.println("sehir.substring(1,3) = " + sehir.substring(1, 3));
        System.out.println("ilce.substring(0,3) = " + ilce.substring(0, 3));// Bod
        String text = "Merhaba Java";
        //             01234567891011
        System.out.println("text.substring(5,10) = " + text.substring(5, 10));
        System.out.println(text.substring(0, 7));
        System.out.println(text.substring(8, 11));//8 9 10
        System.out.println(text.substring(8, 12));//8 9 10 11 Java
//        System.out.println(text.substring(0, 13));//6 7 8 9 10 11 Java   hata verir
        System.out.println(text.substring(8));//text.substring(8, 12)
        System.out.println("text.length() = " + text.length());
        System.out.println("text.substring(8) = " + text.substring(8));
        System.out.println("text.substring(length-4) = " + text.substring(text.length() - 4));
        text = "Merhaba Istanbul";
        System.out.println("text.substring(length-3) = " + text.substring(text.length() - 3));
        System.out.println(text.substring(text.length() - 1));
        System.out.println(text.substring(0, 7));
        //                 Merhaba Istanbul
        //                 01234567
        System.out.println("text = " + text);
        String merhaba=text.substring(7);
        System.out.println( merhaba);
        System.out.println("text = " + text);
        text="MERHABA Istanbul";
        System.out.println("text.toLowerCase() = " + text.toLowerCase());
        System.out.println("text = " + text);
        System.out.println("text.toUpperCase() = " + text.toUpperCase());
        System.out.println("sehir = " + sehir);
        System.out.println("sehir.toUpperCase() = " + sehir.toUpperCase());

    }
}

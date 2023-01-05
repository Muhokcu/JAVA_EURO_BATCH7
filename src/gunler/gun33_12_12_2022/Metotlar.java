package gunler.gun33_12_12_2022;

public class Metotlar {
    public static void main(String[] args) {
        String sehir = "Istanbul";
        String ilce;
        ilce = new String("Bodrum");
        String kulup = new String("Besiktas");
        //
        System.out.println("sehir.length() = " + sehir.length());
        System.out.println("ilce.length() = " + ilce.length());
        //   Bodrum  ----> length -->6
        //   012345

        //   Istanbul---->length --->8
        //   01234567
        System.out.println("sehir.charAt(0) = " + sehir.charAt(0));
        System.out.println("ilce.charAt(0) = " + ilce.charAt(0));
        System.out.println("sehir.charAt(7) = " + sehir.charAt(7));
        System.out.println("sehir.charAt(sehir.length()) = " + sehir.charAt(sehir.length() - 1));
        System.out.println("ilce.charAt(ilce.length()-1) = " + ilce.charAt(ilce.length() - 1));
        //Istanbul
        sehir.charAt(0);
        sehir.charAt(1);
        sehir.charAt(2);
        sehir.charAt(3);
        sehir.charAt(4);
        for (int i = 0; i < sehir.length(); i++) {
            System.out.println(sehir.charAt(i));
        }
        for (int i = 0; i < ilce.length(); i++) {
            System.out.println(ilce.charAt(i));
            }

        }
    }

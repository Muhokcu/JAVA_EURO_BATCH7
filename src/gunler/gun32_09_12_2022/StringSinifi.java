package gunler.gun32_09_12_2022;

public class StringSinifi {
    public static void main(String[] args) {
        String sehir = "Istanbul";
        //              01234567
        String ilce = new String("Ayvalik");
        System.out.println("sehir = " + sehir);
        System.out.println("ilce = " + ilce);
        // index no 0 dan baslar
        System.out.println("sehir.charAt(0) = " + sehir.charAt(0));
        System.out.println("sehir.charAt(2) = " + sehir.charAt(2));
        System.out.println(sehir.length());//Istanbul
        System.out.println(sehir.length() - 1);//7
        int sonHarfIndeksi = sehir.length() - 1;
        System.out.println(sehir.charAt(7));
    }
}

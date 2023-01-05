package gunler.gun33_12_12_2022;

public class Metotlar6 {
    public static void main(String[] args) {
        String sehir = "Merhaba Java Merhaba ";
        System.out.println(sehir.replace("Merhaba", "Hello"));
        System.out.println(sehir.startsWith("Hello"));
        System.out.println("sehir.startsWith(\"Merhaba\") = " + sehir.startsWith("Mer"));
        System.out.println("sehir.endsWith(\"Merhaba\") = " + sehir.endsWith("aba "));
        String kulup = "Liverpool";
        String kulup2 = "LIVERPOOL";
        System.out.println("kulup2.equals(kulup) = " + kulup2.equals(kulup));
        System.out.println("kulup2.equalsIgnoreCase(kulup) = " + kulup2.equalsIgnoreCase(kulup));
        boolean kulupEsitmi = kulup2.toLowerCase().equals(kulup);
        //  LIVERPOOL
        // liverpool    esitmi Liverpool
        System.out.println("kulupEsitmi = " + kulupEsitmi);
        kulupEsitmi = kulup2.toLowerCase().equals(kulup.toLowerCase());
        System.out.println("kulupEsitmi = " + kulupEsitmi);
        System.out.println("kulup2.equalsIgnoreCase(kulup) = " + kulup2.equalsIgnoreCase(kulup));

    }
}

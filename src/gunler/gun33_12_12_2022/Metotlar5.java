package gunler.gun33_12_12_2022;

public class Metotlar5 {
    public static void main(String[] args) {
        String text = "ey edip adanada pide ye";
        //             012345678
        System.out.println("text.contains(\"edip\") = " + text.contains("edip"));
        System.out.println("text.contains(\"edip1\") = " + text.contains("edip1"));
        System.out.println("text.contains(\"ada\") = " + text.contains("ada"));
        text.contains("a");
        System.out.println("text.indexOf(65) = " + text.indexOf(97));
        System.out.println("text.replace(\"edip\",\"ali\") = " + text.replace("edip", "ali"));
        String bursa = text.replace("adana", "Bursa");
        System.out.println("text = " + text);
        System.out.println("bursa = " + bursa);
        String ali = "Ali";
        String veli = "Veli";
        System.out.println(ali + veli);
        String cumle = " " + veli + " beraber okula gidiyorlar";
        System.out.println("ali.concat(veli) = " + ali.concat(" ve  " + veli));
        System.out.println(ali.concat(cumle));
        System.out.println(ali.concat(" " + veli + " beraber okula gidiyorlar"));
        System.out.println("ali = " + ali);
        System.out.println("veli = " + veli);
        String kulup = "Liverpool ";
        String rakip = " Chelsea";
        System.out.println("kulup+rakip = " + kulup + rakip);
        System.out.println("kulup.concat(rakip) = " + kulup.concat(rakip));
        System.out.println("kulup.equals(rakip) = " + kulup.equals("Liverpool "));
        String kulup2 = new String("Liverpool ");
        System.out.println("kulup2.equals(kulup) = " + kulup2.equals(kulup));
        boolean kulupDegerleriEsitmi = kulup2.equals(kulup);
        System.out.println("kulupDegerleriEsitmi = " + kulupDegerleriEsitmi);
        System.out.println("kulup2==kulup = " + kulup2 == kulup);
        int numara = 10;
        String kulup3 = "Liverpool ";
        System.out.println(kulup3 == kulup);
        System.out.println("kulup2.equals(kulup) = " + kulup2.equals(kulup));
    }
}

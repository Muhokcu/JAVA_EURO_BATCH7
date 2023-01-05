package gunler.gun33_12_12_2022;

public class Metotlar3 {
    public static void main(String[] args) {
        String text = "Ey edip adanada pide edip ye";
        //             01234567890123456789012
        String sehir = "Canakkale";
        //              012345678
        System.out.println("sehir.indexOf('k') = " + sehir.indexOf('k'));
        System.out.println("sehir.lastIndexOf('k') = " + sehir.lastIndexOf('k'));
        System.out.println("sehir.indexOf('a') = " + sehir.indexOf('a'));
        System.out.println("sehir.indexOf('z') = " + sehir.indexOf('z'));// -1 mevcut degil
        System.out.println("text.indexOf(\"edip\") = " + text.indexOf("edip"));
        System.out.println("sehir.indexOf(\"kale\") = " + sehir.indexOf("kale"));
        System.out.println("sehir.substring(5,9) = " + sehir.substring(5, 9));
        System.out.println("sehir.indexOf('a') = " + sehir.indexOf('a'));
        System.out.println("sehir.lastIndexOf('a') = " + sehir.lastIndexOf('a'));
        System.out.println("sehir.indexOf('a',2) = " + sehir.indexOf('a', 2));
        System.out.println("text.indexOf(\"edip\") = " + text.indexOf("edip"));
        System.out.println("text.lastIndexOf(\"edip\") = " + text.lastIndexOf("edip"));
        text = "Ey edip adanada pide ye edip ye";
        String aranan = "edip";
        int ilk = text.indexOf(aranan);
        int son = text.lastIndexOf("edip");
        System.out.println("text.substring(ilk,son) = " + text.substring(ilk, son));
        aranan = "   edip   ";
        String edip = aranan.trim();
        System.out.println("text.indexOf(aranan) = " + text.indexOf(edip));
        System.out.println("aranan = " + aranan + ".");
        System.out.println("aranan = " + aranan.trim() + ".");
        System.out.println("aranan = " + aranan);
        System.out.println("text.substring(ilk,son) = " + text.substring(ilk+4, son));
        System.out.println("edip.length() = " + edip.length());
        ilk=edip.length()+ilk;
        System.out.println("text.substring(ilk,son) = " + text.substring(ilk, son));
    }
}

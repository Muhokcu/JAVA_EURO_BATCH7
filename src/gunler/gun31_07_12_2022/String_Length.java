package gunler.gun31_07_12_2022;

public class String_Length {
    public static void main(String[] args) {
        String str = "Eurotech Study";
        str.length();
        System.out.println(str.length());
        int uzunluk = str.length();
        System.out.println("uzunluk = " + uzunluk);
        String str2 = "    ";
        System.out.println(str2.length());
        String str3 = "";
        System.out.println(str3.length());


        int carpim = str.length() * 5;
        System.out.println("carpim = " + carpim);

    }
}

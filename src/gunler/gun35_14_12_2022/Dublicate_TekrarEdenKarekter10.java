package gunler.gun35_14_12_2022;

public class Dublicate_TekrarEdenKarekter10 {
    public static void main(String[] args) {
        String str = "abc abc def def ";
        String yeni = "";// abscd
        for (int i = 0; i < str.length(); i++) {
//            System.out.println("str.charAt(i) = " + str.charAt(i));
            if (!yeni.contains("" + str.charAt(i))) {
//            if (!yeni.contains(String.valueOf(str.charAt(i)))) {
                yeni = yeni + str.charAt(i);
            }
        }
        System.out.println("yeni = " + yeni);


    }
}

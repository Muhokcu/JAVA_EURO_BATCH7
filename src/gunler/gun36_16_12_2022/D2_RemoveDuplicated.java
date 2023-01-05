package gunler.gun36_16_12_2022;

public class D2_RemoveDuplicated {
    public static void main(String[] args) {
        // Verilen string icerisindeki tekrar edilen karakterleri kaldiran bir method yaziniz
        // "AAACDDDWCEFQ"

        String uniqueString = removeDuplicated("AAACDDDWCEFQ");
        System.out.println(uniqueString);

        System.out.println(removeDuplicated("hhhiiiwwwcccyaooheef"));

    }

    public static String removeDuplicated(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}

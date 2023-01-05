package gunler.gun33_12_12_2022;

public class FirstHalf {
    public static void main(String[] args) {
        //
//        Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//
//
//                firstHalf("WooHoo") → "Woo"
//        firstHalf("HelloThere") → "Hello"
//        firstHalf("abcdef") → "abc"
        String str = "HelloThere";// length 6
        //            012345
        System.out.println("str.substring(0,3) = " + str.substring(0, str.length()/2));
    }
}

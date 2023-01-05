package gunler.gun14_08_11_2022;

public class Makes10 {
    public static void main(String[] args) {
        // Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


        // makes10(9, 10) → true
        // makes10(9, 9) → false
        // makes10(1, 9) → true
        int a = 11;
        int b = 1;
        boolean sonuc = false;
        if ((a + b == 10) || (a == 10) || (b == 10)) {
            sonuc = true;
            System.out.println("sonuc 10");
        } else {
            sonuc = true;
            System.out.println("sonuc 10 degil");
        }
        System.out.println("sonuc = " + sonuc);
    }
}
// yanlis olabilir tekrar bak
package gunler.gun12_04_11_2022;

public class Love6 {
    public static void main(String[] args) {
       /* The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.


                love6(6, 4) → true
        love6(4, 5) → false
        love6(1, 5) → true

        */
        int a = 1;
        int b = 5;
        boolean alti = a - b == 6 || a + b == 6 || a == 6 || b == 6;
        if (alti) {
            System.out.println("Sonuc 6 ");
        } else {
            System.out.println("malesef 6 yok");
        }
    }
}

package gunler.gun14_08_11_2022;

public class LastDigit {
    public static void main(String[] args) {
        //Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
        //
        //
        //lastDigit(7, 17) → true
        //lastDigit(6, 17) → false
        //lastDigit(3, 113) → true
        int a = 103;
        int b = 21;
        // son rakamlari ayni ise true yazdiralim degil ise false yazdiralim
        boolean sonRakamlarAyni = false;
        if (a % 10 == b % 10) {
            System.out.println("son rakamlar ayni");
            sonRakamlarAyni = true;
        } else {
            System.out.println("son rakamalar ayni degil");
        }
        System.out.println("sonRakamlarAyni = " + sonRakamlarAyni);

    }
}

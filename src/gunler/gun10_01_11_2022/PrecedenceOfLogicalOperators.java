package gunler.gun10_01_11_2022;

public class PrecedenceOfLogicalOperators {

    public static void main(String[] args) {

        /*
        Precedence of Logical Operators

        Highest
            !
            &&
            ||
        Lowest
         */

        int i1 = 10;
        int i2 = 15;
        int i3 = 20;

        boolean check = i1 != i2 || !(i1 == i3) && i2 == i3;     //  T || T && F
        //  T || F
        //    T
        System.out.println("check = " + check);

        boolean check2 = (i1 >= i2) && (i3 == i2) || (i1 != i3); //  F && F || T
        //       F || T
        System.out.println("check2 = " + check2);                //          T
    }
}

package gunler.gun39_21_12_2022;

import java.io.PrintWriter;

public class D9Autoboxing_Unboxing {
    public static void main(String[] args) {
        // Autoboxing --> primitive to wrapper
        Integer num1 = 123;
        int num2 = 12;
        Integer num3 = num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        // Unboxing --> wrapper to primitive
        Double d1 = Double.valueOf(23.5);
        double d2 = d1;
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        int number1 = new Integer(123); // wrapper to primitive // Unboxing
        Integer number2 = new Integer(123); // No boxing
        int number3 = number2; // wrapper to primitive // Unboxing
        Integer number4 = Integer.valueOf(345);
        //Double number5 = number4; // Wrapper objectler arasi autocasting assignment ile soz konusu degil

    }
}

package gunler.gun11_02_11_2022;

public class IfStatementExercies {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("User is aligible to vote");

        } else {
            System.out.println("User is not aligible to vote");
        }
        // Write a program that calculates the area of a circle
        int radius = 0;
        double area = 0;
        double pi = 3.14;
        if (radius > 0) {
            area = radius * radius * pi;
            System.out.println("area = " + area);

        } else {
            System.out.println("This is not a circle");
        }
        // wriete a java program prints whether iy is positive number
        int number = -11;
        if (number >= 0) {
            System.out.println(number + " is a positive number");
        } else {
            System.out.println(number + " is a negative number");
        }


        // bir sayinin te mi cift mi oldugunu
        int number1 = 20;
        if (number1 % 2 == 0) {
            System.out.println("cift");
        } else {
            System.out.println("tek");
        }
        int numara = 91;
        int pay = 1000;
        if (numara > 90) {
            pay += (pay * 3 / 100);
        } else pay += (pay * 1 / 100);
        System.out.println("pay = " + pay);


    }
}

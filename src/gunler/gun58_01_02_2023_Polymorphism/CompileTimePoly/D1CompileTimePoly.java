package gunler.gun58_01_02_2023_Polymorphism.CompileTimePoly;

public class D1CompileTimePoly {// Compile Time Polymorphism / Static polymophism / Method Overloading

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int multiply(int a, int b, int c){
        return a * b * c;
    }

    public static double multiply(double a, double b){
        return a * b;
    }
}

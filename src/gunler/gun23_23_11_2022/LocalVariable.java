package gunler.gun23_23_11_2022;

public class LocalVariable {
    public static void main(String[] args) {
        calculation1(5, 10);
        calculation1(5, 10);
        int num1 = 1;
        int num2 = 2;
        int result = 10;
    }

    public static void calculation1(int num1, int num2) {
        //local var
        int result;
        result = num1 * num2;
        System.out.println("result = " + result);

    }

    public static void calculation2(int num1, int num2) {
        //local var
        int result;
        result = num1 + num2;
        System.out.println("result = " + result);

    }
}
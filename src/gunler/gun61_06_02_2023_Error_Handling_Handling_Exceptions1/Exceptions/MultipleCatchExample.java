package gunler.gun61_06_02_2023_Error_Handling_Handling_Exceptions1.Exceptions;

public class MultipleCatchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            int x = 10;
            int y = 1;
            int result = x / y; // division by zero trows Arithmetic Exception
            System.out.println("result = " + result);
            System.out.println("Number at index 5 " + numbers[5]); // ArrayOutOfBoundException
        } catch (ArithmeticException a) {
            System.out.println("Can not divide to zero");
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("Array Index out of bond");
            // b.printStackTrace(); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3 at gunler.gun61.Exceptions.MutipleCatchExample.main(MutipleCatchExample.java:14)
        }
        System.out.println("/////////////////////////////////");
        try {

            int x = 10;
            int y = 0;
            int result = x / y; // division by zero trows Arithmetic Exception
            System.out.println("result = " + result);
            System.out.println("Number at index 5 " + numbers[5]); // ArrayOutOfBoundException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException a) {
            System.out.println("Handled Exception");
        }
    }
}

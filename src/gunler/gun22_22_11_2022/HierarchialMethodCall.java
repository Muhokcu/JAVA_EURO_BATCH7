package gunler.gun22_22_11_2022;

public class HierarchialMethodCall {
    public static void main(String[] args) {
        System.out.println("Main method");
        displayMessage();
        System.out.println("Back to Main Method");
    }

    public static void displayMessage() {
        System.out.println("Hello World");
        calculation();
        System.out.println("Back to displayMassage Method");
    }

    public static void calculation() {
        System.out.println(10 * 5 / 2 + 1);
    }
}

package gunler.gun23_23_11_2022;

public class Method_Return {
    public static void main(String[] args) {
        System.out.println("calculatation(5,6) = " + calculatation(5, 6));
        int result = calculatation(10, 20);
        System.out.println("total = " + result);
        System.out.println(calculatation(15,25));
    }
    public static int calculatation(int num1, int num2) {
        int total;
        total = num1 + num2;
        return total;
    }
}

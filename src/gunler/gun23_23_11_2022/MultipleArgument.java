package gunler.gun23_23_11_2022;

public class MultipleArgument {
    public static void main(String[] args) {
        calculation(10, 5);
        calculation(5, 100);

    }

    public static void calculation(int num1, int num2) {
        int total;
        total = num1 + num2;
        System.out.println("num1 = " + num1);
       System.out.println("num2 = " + num2);
        System.out.println("toplam deger :" + total);
    }
}

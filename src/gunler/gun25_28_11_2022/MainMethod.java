package gunler.gun25_28_11_2022;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("Hello");
        main(5);
        main("Hello Java");

    }

    public static void main(int a) {
        System.out.println("a = " + a);
    }

    public static void main(String str) {
        System.out.println("str = " + str);
    }
}

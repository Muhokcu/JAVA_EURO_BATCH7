package gunler.gun06_25_10_2022;

public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
//        int c = a + b;// 50
//        a = c - a;// 50 - 20
//        b = c - b;// 50 - 30
//      //  b = c - a;// 50 - 30
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
        a=a+b-a;         b=a+b-a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

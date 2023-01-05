package gunler.gun06_25_10_2022;

public class AritmetikOperatorler2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = b - a;
        System.out.println("c = " + c);
        double d = 30.50;
        System.out.println(d - a);
        System.out.println(a - d);
        int c1 = a * b;// 20  30 = 600
        System.out.println("c1 = " + c1);
        int i = a * b * c;// in int int
        System.out.println("i = " + i);// 6000
        System.out.println(i / b);
        int hesaplama = 18 + 9 * 6; //  18 + 54    72
        System.out.println("hesaplama = " + hesaplama);
    }
}

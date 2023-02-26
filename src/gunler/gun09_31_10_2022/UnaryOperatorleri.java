package gunler.gun09_31_10_2022;

public class UnaryOperatorleri {
    public static void main(String[] args) {
        int a = 10;
        a++;// post increment a nin degerini 1 artiriyor
        ++a;// pre increment  a nin degerini 1 artiriyor
        System.out.println("a = " + a);// a 12
        int b = ++a;// 13
        b = a++;// 13 + 1
        System.out.println("a = " + a);// 14
        System.out.println("b = " + b);// 13
        b = ++a;
        System.out.println("b = " + b);// 15
        System.out.println("a = " + a);// 15
        int c = a + b;
        System.out.println("c = " + c);


    }
}

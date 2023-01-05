package gunler.gun25_28_11_2022;

public class Promotion {
    public static void main(String[] args) {
        int a = 10;
        print(a);
        byte b = 10;
        print(b);
        // byte short int long float double
        print(b);
        print((int) 10.5);
        int d2 = (int) 10.5;

        char harf = 'A';
        print(harf);
//        byte b = 66;
//        print((char) b);


    }

    public static void print(double d) {
        System.out.println("d = " + d);
    }

    public static void print(String str) {
        System.out.println("str = " + str);
    }

    public static void print(int a) {
        System.out.println("a = " + a);
    }

    static void print(long numara) {
        System.out.println("numara = " + numara);
    }

    public static void print(char c) {
        System.out.println("c = " + c);
    }
}

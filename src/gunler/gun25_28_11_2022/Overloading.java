package gunler.gun25_28_11_2022;

public class Overloading {
    public static void main(String[] args) {
        int sayi = 10;
        int b = 5;
        int c = 60;
        toplama(sayi, 5);
        toplama(b, 50);
        toplama(sayi, b, c);
        toplama(10, 23);
        toplama(5, 10);
        toplama(10, 20, 30);
        toplama(5.5, 10.5);
    }

    public static void toplama(int a, int b) {
        int toplam = a + b;
        System.out.println("toplam = " + toplam);
    }
//    static int toplama(int a, int b) {
//        int toplam = a + b;
//        System.out.println("toplam = " + toplam);
//        return 5;
//    }

    public static void toplama(String a, int b) {// yerler,siralari degisti
        System.out.println("b");
    }

    public static void toplama(int b, String a) {
        System.out.println(a);
    }

    static void toplama(int a, int b, int c) {// parametre sayisi
        int toplam = a + b + c;
        System.out.println(toplam);
    }

    static void toplama(double a, double b) {// typelar farkli
        double d = a + b;
        System.out.println("d = " + d);

    }
}

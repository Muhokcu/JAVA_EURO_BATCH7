package gunler.gun25_28_11_2022;

public class Yazdir {
    public static void main(String[] args) {
        yazdir(5);
        yazdir("Ali");
        yazdir("Ronaldo", 37);
        yazdir(60, "Veli");
        yazdir(10, 5);
        yazdir("Ali", "Veli");
    }

    static void yazdir() {
        System.out.println("Hello Java");
    }

    static void yazdir(int a) {
        System.out.println("a = " + a);
    }

    static void yazdir(int a, int b) {
        System.out.println(a + b);
    }

    static void yazdir(String isim) {
        System.out.println("Merhaba " + isim);
    }

    static void yazdir(int yas, String isim) {
        System.out.println(isim + " " + yas);
    }

    static void yazdir(String isim, int yas) {
        System.out.println(isim + " " + yas);
    }

    static void yazdir(String isim, String ism) {
        System.out.println(isim);
        System.out.println("ism = " + ism);
    }
    //    static int yazdir(String isim, String isim2) { return type i degistirmekle overloading olmuyor
//
//        return 5;
//    }
    static void yazdir(String isim, String isim2, double d) {

    }
}

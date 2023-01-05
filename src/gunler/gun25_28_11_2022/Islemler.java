package gunler.gun25_28_11_2022;

import java.util.Locale;

public class Islemler {

    public static void main(String[] args) {

        islem(10, 20, '*');
        islem(10, 20, '+');
        islem(100, 20, '/');
        islem(100, 20, '%');
        islem(10, 40, "Topla");
        islem(10, 40, "Carp");
        int toplamaIslemi100_200 = islem("Topla", 200, 300);
        System.out.println("toplamaIslemi100_200 = " + toplamaIslemi100_200);
        int carp_20_30 = islem("Carp", 20, 30);
        System.out.println("carp_20_30 = " + carp_20_30);
    }

    public static int islem(String operator, int a, int b) {
        switch (operator) {
            case "Carp":
                return a * b;
            case "Bol":
                return a / b;
            case "Cikar":
                return a - b;
            case "Mod":
                return a % b;
            case "Topla":
                return a + b;
            default:
                return 0;
        }
    }

    public static void islem(int a, int b, String operator) {
        switch (operator) {
            case "Carp":
                carpma(a, b);
                break;
            case "Bol":
                bolme(a, b);
                break;
            case "Topla":
                toplama(a, b);
                break;
            case "Mod":
                modulus(a, b);
                break;
            case "Cikar":
                cikarma(a, b);
                break;
            default:
                System.out.println("gecersiz islem");
        }
    }


    public static void islem(int a, int b, char operator) {
        switch (operator) {
            case '*':
                carpma(a, b);
                break;
            case '+':
                toplama(a, b);
                break;
            case '-':
                cikarma(a, b);
                break;
            case '/':
                bolme(a, b);
                break;
            case '%':
                modulus(a, b);
                break;
            default:
                System.out.println("Gecersiz islem");
        }

    }

    // 2 int parametreli
    // toplama, carpma, cikarma , bolme , modulus
    public static void toplama(int a, int b) {
        System.out.println("toplama " + (a + b));
    }

    public static void cikarma(int a, int b) {
        System.out.println("cikarma " + (a - b));
    }

    public static void carpma(int a, int b) {
        System.out.println("carpma " + (a * b));
    }

    public static void bolme(int a, int b) {
        System.out.println("bolme " + (a / b));
    }

    public static void modulus(int a, int b) {
        System.out.println("modulus " + (a % b));
    }
}
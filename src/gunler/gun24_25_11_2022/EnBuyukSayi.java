package gunler.gun24_25_11_2022;

public class EnBuyukSayi {
    public static void main(String[] args) {
        // uc integer parametreli bir metot olusturun ve buyuk olani yazdirin
        int a = 10;
        int b = 20;
        int c = 30;
        enBuyukSayi(a, b, c);
        enBuyukSayi(40, 50, 60);
        int buyukSayi3 = enBuyukSayi(70, 50, 60);
        System.out.println("buyukSayi3 = " + buyukSayi3);

    }

    public static int enBuyukSayi(int a, int b, int c) {
        int max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        max = (a > b && a > c) ? a : (b > c) ? b : c;
        System.out.println("max = " + max);
        return max;
    }
}

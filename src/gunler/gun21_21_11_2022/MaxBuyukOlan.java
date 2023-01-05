package gunler.gun21_21_11_2022;

public class MaxBuyukOlan {
    public static void main(String[] args) {
        int a = 15;
        int b = 15;
        int buyukSayi = 0;
        if ((a > 9 && a < 21) && (b > 9 && b < 21)) {
            if (a > b) {
                buyukSayi = a;
            } else {
                buyukSayi = b;
            }
        } else if ((a > 9 && a < 21) && (b < 10 || b > 20)) {
            buyukSayi = a;
        } else if ((b > 9 && b < 21) && (a < 10 || a > 20)) {
            buyukSayi = b;
        } else if (a == b) {
            buyukSayi = 0;
        } else {
            buyukSayi = 0;
        }
        System.out.println("buyukSayi = " + buyukSayi);
    }
}

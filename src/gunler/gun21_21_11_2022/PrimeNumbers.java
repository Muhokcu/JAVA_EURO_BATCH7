package gunler.gun21_21_11_2022;

public class PrimeNumbers {
    public static void main(String[] args) {
        //        int number = 20;
//        //  2 3 4 5 6  7   8
//        boolean asalSayi = true;
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                System.out.println("bu sayi asal sayi degildir");
//                asalSayi = false;
//                break;
//            }
//        }
//        System.out.println(asalSayi);
//  2 3 4 5 6 7 8      9
        boolean asalSayi = true;
        int baslangic = 2;
        int son = 100;
        for (int n = baslangic; n < son; n++) {

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    //  System.out.println(n + " asal sayi degildir");
                    asalSayi = false;
                    break;
                }
            }
            if (asalSayi) {
                System.out.println(n + " asal sayidir ");
            } else {
                // System.out.println(n + " asal sayi degildir");
                System.out.printf("%d asal sayi degildir", n);
                System.out.println();
                // %d --->decimal
            }
            asalSayi = true;
        }

    }
}

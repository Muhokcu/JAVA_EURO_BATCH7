package gunler.gun18_15_11_2022;

public class Faktoriyel {
    public static void main(String[] args) {
        // Bir sayinin faktoriyelini hesapla
        int fak = 1;
        int sayi = 15;
        for (int i = sayi; i >= 1; i--) {
            fak *= i;
        }
        System.out.println(fak);
    }
}

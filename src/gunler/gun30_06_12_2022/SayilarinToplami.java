package gunler.gun30_06_12_2022;

import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen 3 adet sayi giriniz");
        // 3 veriyi sirali bir sekilde kullanicidan alirken her bitinden sonra enter kullanmak mumkun oldugu gibi
        // saylari space ile de ayirarak konsoldan almak mumkun
        double sayi1 = sc.nextDouble();
        double sayi2 = sc.nextDouble();
        double sayi3 = sc.nextDouble();
        double toplamSayi = sayi1 + sayi2 + sayi3;
        System.out.println("toplamSayi = " + toplamSayi);
    }
}

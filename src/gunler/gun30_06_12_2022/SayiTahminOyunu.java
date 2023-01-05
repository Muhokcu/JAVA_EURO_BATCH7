package gunler.gun30_06_12_2022;

import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen 1 ile 30 arasi bir rakam tahmin ediniz!");
        int input;
        int gizliSayi = 10;
        int sayac = 0;


        do {
            input = sc.nextInt();
            if (input < 0 || input > 30)
                System.out.println("Hatali aralikta sayi girdiniz");

            if (input < gizliSayi) {

                System.out.println("Daha buyuk bir rakam giriniz");
            } else if (input > gizliSayi) {
                System.out.println("Daha kucuk bir rakam giriniz");


            } else {
                System.out.println("Tebrikler sayiyi buldunuz");
            }
            sayac++;


        } while (input != gizliSayi);
        System.out.println("Sayiyi " + sayac + " nci denemede buldunuz");


    }
}

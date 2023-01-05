package gunler.gun34_13_12_2022;

import java.util.Scanner;

public class D8_AlisVerisListesi {
    public static void main(String[] args) {
        // Kullanicidan veri alarak bir alis veris listsi olusturun


        Scanner sc = new Scanner(System.in);
        System.out.println("Alis Veris Listesi");
        String[] eksikler = new String[6];

        //  int liste = sc.nextInt();


        System.out.println("Lutfen eksikleri giriniz ");
        for (int i = 0; i < eksikler.length; i++) {
            System.out.print(i + 1 + ". urun : ");
            eksikler[i] = sc.nextLine();

        }
        System.out.println("Sectiginiz urun listesi");
        for (int i = 0; i < eksikler.length; i++) {
            System.out.println(" eksikler[i] = " + eksikler[i]);
        }


    }
}

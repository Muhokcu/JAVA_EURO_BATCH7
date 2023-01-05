package gunler.gun32_09_12_2022;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner kullanicidan = new Scanner(System.in);
//        System.out.println("bir kelime giriniz");
//        String kullanici = kullanicidan.next();
//        System.out.println("kullanici = " + kullanici);
        System.out.println("bir cumle yaziniz");
        String cumle = kullanicidan.nextLine();
        System.out.println("cumle = " + cumle);
        System.out.println("bir sayi yazinikz");
        int kullaniciSayisi = kullanicidan.nextInt();
        System.out.println("kullaniciSayisi = " + kullaniciSayisi);
        System.out.println("boolean bir deger yaziniz");
        boolean kullanicidanBoolean = kullanicidan.nextBoolean();
        System.out.println("kullanicidanBoolean = " + kullanicidanBoolean);

        paraCekme();

    }

    public static void paraCekme() {
        double hesabindakiPara = 1000;
        Scanner kullanici = new Scanner(System.in);
        System.out.println("ne kadar para cekeceksiniz");
        double cekilmekIstenenPara = kullanici.nextDouble();
        double hesaptaKalanPara = hesabindakiPara - cekilmekIstenenPara;
        System.out.println("hesaptaKalanPara = " + hesaptaKalanPara);

    }
}

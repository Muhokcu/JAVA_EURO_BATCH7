package gunler.gun29_05_12_2022;

import java.util.*;

public class RandomClass {
    public static void main(String[] args) {
        Random rastgele = new Random();
        System.out.println("rastgele.nextInt() = " + rastgele.nextInt());
        System.out.println("rastgele.nextInt(10) = " + rastgele.nextInt(10));
        for (int i = 0; i < 10; i++) {
            System.out.println("rastgele.nextInt(10) = " + rastgele.nextInt(10));
        }
        int randomSayi = rastgele.nextInt(100);
        System.out.println("randomSayi = " + randomSayi);
        System.out.println("rastgele.nextDouble() = " + rastgele.nextDouble());
        System.out.println("rastgele.nextDouble() = " + rastgele.nextDouble());
        System.out.println("rastgele.nextBoolean() = " + rastgele.nextBoolean());
        System.out.println("rastgele.nextInt(50) = " + rastgele.nextInt(50));// 0-50 arasi
        // 50 -100 arasi olsun
        int elliYuzArasi = rastgele.nextInt(50) + 50;
        System.out.println("elliYuzArasi = " + elliYuzArasi);
        int max = 20;// istedigim sayinin ust limiti
        int min = -10;// istedigim sayinin alt limiti
        int eksi10ile20Arasi = rastgele.nextInt((max - min)) + min;
        System.out.println("yuzIkiyuzArasiSayi = " + eksi10ile20Arasi);
        for (int i = 0; i < 10; i++) {
            eksi10ile20Arasi = rastgele.nextInt((max - min)) + min;
            System.out.println("eksi10Ile20arasi = " + eksi10ile20Arasi);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("rastgele.nextInt(5,60) = " + rastgele.nextInt(-5, 5));
        }
        zarAtalim();
        zarAtalim();
        zarAtalim();
        zarAtalim();
        ikiZarAtalim();
        ikiZarAtalim();
//        ikiZarAtalim();
//        ikiZarAtalim();
    }

    public static void zarAtalim() {
        Random random = new Random();
        int sonuc = random.nextInt(6) + 1;
        System.out.println("sonuc = " + sonuc);
    }

    public static void ikiZarAtalim() {
        int ilkSayi = new Random().nextInt(6)+1;
        Random random = new Random();
        int ikinciSayi = random.nextInt(6)+1;
//        System.out.println("new Random().nextInt(6) = " + new Random().nextInt(6));
//        System.out.println("new Random().nextInt(6) = " + new Random().nextInt(6));
        System.out.println("ilk " + ilkSayi);
        System.out.println("ikinci " + ikinciSayi);
    }
}

package gunler.gun32_09_12_2022;

import java.util.Random;

public class Ramdom2 {
    public static void main(String[] args) {
        Random rastgele = new Random();
        int sayi = rastgele.nextInt();
        System.out.println("sayi = " + sayi);
        for (int a = 0; a < 10; a++) {//
            sayi = rastgele.nextInt();
            System.out.println("sayi = " + sayi);
            // System.out.println("rastgele.nextInt() = " + rastgele.nextInt());
        }
        int onYirmi = rastgele.nextInt(10, 20);
        System.out.println("onYirmi = " + onYirmi);
        System.out.println(rastgele.nextInt(50));
        System.out.println(rastgele.nextDouble(20, 50));
        System.out.println(rastgele.nextBoolean());
        int b = rastgele.nextInt(1, 7);//
        int yediyeKadar = rastgele.nextInt(6) + 1;// 0 1 2 3 4 5 --->1
        System.out.println("yediyeKadar = " + yediyeKadar);



    }
}

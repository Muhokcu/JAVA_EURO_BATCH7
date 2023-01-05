package gunler.gun32_09_12_2022;

import java.util.Random;

public class RandomMathTarih {
    public static void main(String[] args) {
        Random rastgele = new Random();
        System.out.println("rastgele.nextInt() = " + rastgele.nextInt());
        int sayi = rastgele.nextInt();
        System.out.println("sayi = " + sayi);
        System.out.println(10);
        RandomMathTarih randomMathTarih = new RandomMathTarih();
        randomMathTarih.print();

    }

    public int print() {
        int a = 10;
        System.out.println("a = " + a);
        return 10;
    }

    public void print(int b) {
        int a = 10;
        System.out.println("a = " + a);

    }


}

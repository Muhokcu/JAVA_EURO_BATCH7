package gunler.gun18_15_11_2022;

public class BolmeLoop {
    public static void main(String[] args) {
        //1 den 100 e kadar 5 b bolunen sayilari bastir
        for (int i = 0; i <= 100; i += 5) {
            System.out.print(" " + i);
        }
        //2 yol
        System.out.println("----------------------------");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(" " + i);
            }

        }
        System.out.println("-----------------------------");
        // dongu icersinde cizgi olusturma
        for (int i = 10; i < 50; i++) {
            System.out.print("-");
        }
    }
}

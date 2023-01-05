package gunler.gun19_16_11_2022;

public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 10; i <= 100; i++) {
            if (i % 17 == 4) {
                System.out.println("Consitiona uyan ilk rakam : " + i);
                break;
            }
        }

    }
}

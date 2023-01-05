package gunler.gun21_21_11_2022;

public class Format {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int n = 1; n < 10; n++) {
                System.out.printf("%-2d", n);
//                System.out.print(n);
            }
            System.out.println();
        }
    }
}

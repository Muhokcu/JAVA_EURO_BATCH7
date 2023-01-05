package gunler.gun20_18_11_2022;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        i = 0;
        do {
            System.out.println("hello");
            i++;
        } while (i < 10);
        System.out.println("i = " + i);
        for (i = 0; i < 10; i++) {
            System.out.println("for");
        }
    }
}

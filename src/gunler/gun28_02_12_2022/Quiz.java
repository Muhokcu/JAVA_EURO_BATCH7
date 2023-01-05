package gunler.gun28_02_12_2022;

public class Quiz {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        System.out.print(x > y || x == ++y);
        System.out.print(x < y || x == ++y);
        System.out.print(x < y && x++ == y);
    }
}

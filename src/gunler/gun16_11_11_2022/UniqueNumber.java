package gunler.gun16_11_11_2022;

public class UniqueNumber {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int sonuc = 0;
        if (a == b && b == c) {
            sonuc = 1;
        } else if (a == b || a == c || b == c) {
            sonuc = 2;
        } else {
            sonuc = 3;

        }
        System.out.println("sonuc = " + sonuc);
        sonuc = a == b && b == c ? 1 : a == b || a == c || b == c ? 2 : 3;

        System.out.println("sonuc = " + sonuc);
    }
}

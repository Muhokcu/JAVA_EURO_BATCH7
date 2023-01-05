package gunler.gun12_04_11_2022;

public class SonOdev {
    public static void main(String[] args) {
        int n = 23;
        boolean sonuc = true;
        if (n % 11 == 0 || n % 11 == 1) {
            System.out.println("special 11");
            sonuc = false;

        } else {
            System.out.println("no 11");
        }
        System.out.println("sonuc = " + sonuc);
    }
}

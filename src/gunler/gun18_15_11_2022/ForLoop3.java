package gunler.gun18_15_11_2022;

public class ForLoop3 {
    public static void main(String[] args) {
        int sonNokta = 30;
        int toplam = 0;
        for (int i = 1; i < sonNokta; i += 2) {
            toplam += i;
        }
        System.out.println("Toplam : " + toplam);
    }
}

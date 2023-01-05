package gunler.gun13_07_11_2022.tekrar;

public class Tekrar {
    public static void main(String[] args) {
        int not = 90;
        not = 50;
        char derece = 'A';
        if (not >= 0 && not <= 100) {
            if (not > 85) {
                derece = 'A';
                System.out.println(derece);
            } else if (not >= 70) {
                derece = 'B';
                System.out.println(derece);
            } else if (not >= 50) {
                derece = 'C';
                System.out.println(derece);
            } else if (not >= 30) {
                derece = 'D';
                System.out.println(derece);
            } else if (not >= 0) {
                derece = 'E';
                System.out.println(derece);
            } else {
                System.out.println("Gecersiz not");
            }

        }
    }
}

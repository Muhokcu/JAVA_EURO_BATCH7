package gunler.gun13_07_11_2022.tekrar;

public class Nilgun {
    public static void main(String[] args) {
        int not = 92;
        char derece = 'A';

        if (not >= 0 && not < 101) {
            System.out.println("distaki if body");

            if (not >= 85) {
                derece = 'A';
                System.out.println("dereceniz = " + derece);
            } else if (not >= 70) {
                derece = 'B';
                System.out.println("dereceniz = " + derece);
            } else if (not >= 50) {
                derece = 'C';
                System.out.println("dereceniz = " + derece);

            } else if (not > 30) {
                derece = 'D';
                System.out.println("dereceniz = " + derece);

            } else if (not >= 0) {
                derece = 'E';
                System.out.println("dereceniz = " + derece);

            }
            System.out.println("distaki if block sonu");
        }
    }
}
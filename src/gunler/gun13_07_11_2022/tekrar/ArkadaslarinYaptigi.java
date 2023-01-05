package gunler.gun13_07_11_2022.tekrar;

public class ArkadaslarinYaptigi {
    public static void main(String[] args) {
        int not = 31;
        char derece = 'A';
        //100 -85 arasi super

        if (not >= 85 && not <= 100) {
            System.out.println("super!!!");
            derece = 'A';
        } else if (not >= 70 && not < 85) {
            derece = 'B';
            System.out.println("cok iyi");
        } else if (not >= 50 && not < 70) {
            derece = 'C';
            System.out.println("iyi");
        } else if (not >= 30 && not < 50) {
            derece = 'D';
            System.out.println("biraz daha gayret");
        } else if (not >= 0 && not < 30) {
            derece = 'E';
            System.out.println("cok calismak gerek kaldin");
        }
        System.out.println("Senin Derecen =" + derece);
    }
}

package gunler.gun13_07_11_2022;

public class Anlamadigim1 {
    public static void main(String[] args) {
        int not = 23;
        // 100 - 85 arasinda ise super
        // 85 - 60 arasinda ise suoer
        // 0  - 30 cok  calismalk gerek
        // 30 - 50 biraz daha gayret
        // 50- 70
        // 70 - 85
        if (not >= 0 && not < 30) {
            System.out.println("calismak gerek");
        } else if (not >= 30 && not < 50) {
            System.out.println("biraz daha gayret");
        } else if (not >= 70 && not < 85) {
            System.out.println("iyi daha iyi olacak");
        } else if (not >= 85 && not < 100) {
            System.out.println("Super!!!!!");

        }

    }

}



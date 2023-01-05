package gunler.gun19_16_11_2022;

public class CarpimTablosu {
    public static void main(String[] args) {
        // 10 luk bir carpim tablosu yapiniz


        for (int i = 1; i <= 10; i++) {
            if (i == 6 ||  i== 9 || i == 10) {
                System.out.println(i + " lar ");
            } else {
                System.out.println(i + " ler ");
            }
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();

        }


    }


}

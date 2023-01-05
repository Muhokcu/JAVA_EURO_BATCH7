package gunler.gun17_14_11_2022;

public class DoWhileCiftSayilar {
    public static void main(String[] args) {
        int i = 0;
        int son = 20;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " cift sayidir ");
            } else {
                System.out.println(i + " tek sayidir ");
            }
            i++;
        } while (i < son);
        System.out.println("i = " + i);


        System.out.println("-----------------------");

        i = 0;
        while (i < son) {
            if (i % 2 == 0) {
                System.out.println(i + " Cift sayidir");
            } else {
                System.out.println(i + " Tek sayidir");
            }
            ++i;
        }

    }
}

package gunler.gun17_14_11_2022;

public class WhileOrnek {
    public static void main(String[] args) {
        int i = 0;
        while (i < 50) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            i++;
        }
        i = 0;
        int son = 50;
        while (i < 50) {
            i += 2;
            System.out.print(i + " ");
        }
        i = 50;
        son = 0;
        System.out.println("i = " + i);
        i -= 2;
    }

}


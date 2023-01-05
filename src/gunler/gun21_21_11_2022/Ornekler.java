package gunler.gun21_21_11_2022;

public class Ornekler {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            System.out.println("hello");
            if (i == 4 || i == 6 || i == 8) {
                System.out.println(i + " continue calisacak");
                continue;
            }
            System.out.println("block ici");//i 4 6 ve 8 iken burasi yazmayacak
            System.out.println();
        }
        //hello
        //block ici
        //
        //hello
        //block ici
        //
        //hello
        // 4 counti
        //hello
        //block ici
        //
        // hello
        //6 conti..
        //hello
        //block ici

        //hello
        //8 conti...
        //hello
        //block ici












    }//
}

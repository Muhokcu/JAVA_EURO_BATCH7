package gunler.gun21_21_11_2022;

public class Label {
    public static void main(String[] args) {
        disLoop:
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            ictekiLoop:
            for (int n = 0; n < 3; n++) {
                System.out.print("inner loop");
                if (i == 3 && n == 1) {
//                    if(n==1){
//                        break disLoop;
//                    }
                    break disLoop;
//                    System.out.println(""); ulasilmaz ifade silinmesi gerek
                }

            }
            System.out.println();
        }

    }
}

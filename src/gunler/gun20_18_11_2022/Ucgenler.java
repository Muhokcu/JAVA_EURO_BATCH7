package gunler.gun20_18_11_2022;

public class Ucgenler {
    public static void main(String[] args) {
//        for (int n = 0; n < 4; n++) {
//            for (int i = 0; i < 10; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//**********
//**********
//**********
//**********


//*                          0
//**                         11
//***                        222
//****                       3333
//*****                      44444
        for (int n = 0; n < 5; n++) {
            for (int i = 0; i <= n; i++) {
                System.out.print(n);
            }
            System.out.println();
        }
        for (int n = 0; n < 5; n++) {
            for (int i = 0; i <= n; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
        // 0
        // 01
        // 012
        // 0123
        // 01234
//               *
        //      ***
        //     *****
        //    *******
        for (int n = 1; n <= 5; n++) {
            for (int i = 5; i > n; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2*n-1; i++) {
                System.out.print(n);
            }
            System.out.println();
        }
        // *****    54321
        // ****     5432
        // ***      543
        // **       54
        // *        5
        // fibonacci
        // patternler
        // asal sayilar   0-100 asal sayilar nested
    }
}

package gunler.gun21_21_11_2022;

public class NestedContunieDevam {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("outer block");
            if (i == 2) {
                continue;
            }
            for (int n = 0; n < 4; n++) {
                System.out.print(n);
            }
            System.out.println();
            System.out.println("outher block sonu");
            System.out.println();
        }
    }
}
//outher block
//0123
//outher block sonu
//
//outher block
//0123
//outher block sonu
//
///outher block

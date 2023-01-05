package gunler.gun21_21_11_2022;

import javax.swing.plaf.IconUIResource;

public class NestedContiune {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("outer block");
            for (int n = 0; n < 4; n++) {
                if (n==1||n==3){
                    continue;
                }
                System.out.print(" inner block");
              //  continue;// sart olamadigi icin hic birsey olamaz
            }
            System.out.println();
            System.out.println("outher block sonu");
            System.out.println();
        }
    }
}

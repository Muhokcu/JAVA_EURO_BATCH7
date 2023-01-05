package gunler.gun18_15_11_2022;

public class ForLoopKural {
    public static void main(String[] args) {
        //baska bir data tipi ile for loop mumkunnmu?
        // baska bir data tipinde kullanilabilir

        for (short l = 0; l < 10; l++) {
            System.out.println("hello");

        }
        System.out.println("__________________________");
        // Initialization disarda olabilir
        // birden fazla condition kullanmak mumkun

        int i = 3;
        for (; i < 5 && i > 2; i++) {
            System.out.println(i);
        }
        // inc /dec statement icnde kullanilabilir mi?
        for (int p = 0; p < 5; ) {
            System.out.println("merhaba");
            p++;
        }
        // sonsuz dongu
        //  for (;; ){


        // for (int t = 0, int z = 1; z < 5; z++) //hatali bir yazim iki degisken olamaz
        {

        }

    }
}
// hocanin ki ile karsilastir



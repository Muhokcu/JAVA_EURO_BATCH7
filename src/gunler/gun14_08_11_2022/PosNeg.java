package gunler.gun14_08_11_2022;

public class PosNeg {
    public static void main(String[] args) {
        //Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
        //
        //
        //posNeg(1, -1, false) → true
        //posNeg(-1, 1, false) → true
        //posNeg(-4, -5, true) → true
        int a = -1;
        int b = 1;
        boolean c = false;// true ise her iki int degiskeni de negatif ise true yaz
        // int degiskenlerden bir tanes hegatif bir tanesi poz ise treu yazdir
        boolean sonuc = false;
        if (c) {
            if (a < 0 && b < 0) {
                System.out.println(true);
            }
        } else { // c degiskeni false ise
            if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
                System.out.println(true);
                sonuc = true;

            }
        }
        System.out.println("sonuc = " + sonuc);
    }
}
// eksik dolabilir  tekrar kontrol et pek anlayamadim

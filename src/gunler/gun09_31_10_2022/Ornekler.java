package gunler.gun09_31_10_2022;

public class Ornekler {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean aesitmidirbye = a == b;
        System.out.println("aesitmidirbye = " + aesitmidirbye);//false
        boolean aEsitdegildbye = a != b;
        System.out.println(aEsitdegildbye);// true
        System.out.println("a>= " + (a > b));//false
        a = 10;
        b = 10;
        System.out.println(a>=b);

        System.out.println(a<b);
        System.out.println("a<=b " + (a<=b));

    }
}

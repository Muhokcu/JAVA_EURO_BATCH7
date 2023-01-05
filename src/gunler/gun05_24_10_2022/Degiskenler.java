package gunler.gun05_24_10_2022;

public class Degiskenler {
    public static void main(String[] args) {
        int a = 10;// esitligin sagindaki degeri sola atiyorum
        int b = 20;
        a = b;// b nindegerini a degiskenine atiyorum
        // ust satirda b nin tasimis oldugu degeri a ya atiyorum
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b = 30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

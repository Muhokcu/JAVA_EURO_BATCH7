package gunler.gun09_31_10_2022;

public class RelationalOperatorler {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a==10  = " + 2 + 9);

        System.out.println(a == 10);// a 10 a esitmi degerini verir
        System.out.println(a == 50);

        int b = 20;
        System.out.println(b > a);// > b degiskenin degeri a degiskenin degerinden buyuk mu
        boolean sonuc = b > a;
        System.out.println("sonuc = " + sonuc);
        boolean b1 = a == b;
        System.out.println("b1 = " + b1);


        b = 10;
        a = 5;
        System.out.println("a>b = " + (a > b));
        String s = "a>b " + (a > b);
        System.out.println(s);
        a = 10;
        b = 100;
        System.out.println(a >= b);
        System.out.println(a < b);
        boolean aKucukEsitb = a <= b;
        System.out.println("aKucukEsitb = " + aKucukEsitb);
        System.out.println(a != b);// a b ye esit degildir


    }
}

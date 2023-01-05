package gunler.gun06_25_10_2022;

public class AritmetikOperatorler {
    public static void main(String[] args) {
        //toplama
        System.out.println(5 + 5);
        int a = 10;
        int b = 20;
        int sonuc = a + b;// 10 + 20
        System.out.println("sonuc = " + sonuc);
        double d = 10.20;
        double v = d + a;
        // int + int ---->   int
        // int +double-----> double
        double d1 = a + b;// 10  20  =  30.0
        System.out.println("d1 = " + d1);
        // numeric olmayan degiskenler icin
        boolean b1 = true;
        //    double d4 = b1 + d;
        char c = 'a';
        char b3 = 'b';
        int i = c + b3;// karakterlerin ascii table deki degerleri toplaniyor
        System.out.println("i = " + i);
        String ab = "c" + "b3";
        System.out.println(ab);// cb3
        String str = "Ali" + "Veli";
        System.out.println("str = " + str);
        String s = "a" + "b";
        String ab2 = "" + c + b3;// ab
        System.out.println("ab2 = " + ab2);

    }
}
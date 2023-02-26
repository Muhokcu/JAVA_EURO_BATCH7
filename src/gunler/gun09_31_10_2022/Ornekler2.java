package gunler.gun09_31_10_2022;

public class Ornekler2 {
    public static void main(String[] args) {
        int max;// declaration
        int min = 10;// declare + atama
        max = 17 - 4 / 10;  //  17
        max = max + 6; //  17 + 6  max=23
        min = max - min; // 23 - 10 min=13
        System.out.println(max * 2);// 23 * 2 =  46
        System.out.println(max + min);// 23 + 13 =  36
//        max?  min?
        System.out.println(++max);// 24
        System.out.println(min--);// 13
        System.out.println(min);// 12
//        =======================

        int z = 27;
        System.out.println("z mod 5:" + z % 5);// 27 / 5 kalan 2
//        =============================
        boolean result;
        int b = 10;
        int c = 20;

        result = c > b;// assign true

        //negate the value using ! unary operator
        //it will output false
        System.out.println(!result);
        // ! boolen degeri ters cevirir
        System.out.println(!true);// not - degil manasii katiyor

        System.out.println(!(b > c));
//===================================================
        int a;
        a = b = c = 5;
        //   sonuc= 5 +  5 (islem sonrasinda b ye bir ekleyecek b nin degeri 5+1=6 olacak)   +   6   =  16
        int sonuc = a + b++ + ++c;  //       5  5  6
        System.out.println("sonuc = " + sonuc);
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println("c = " + c);
//=======================================
        int numara = 10;
        int x = numara++;
        System.out.println("x = " + x);// 10
        System.out.println("numara = " + numara);// 11
//        ============================================
//        "hello 34 " + 2 * 4
//        2 + "(int) 2.0" + 2 * 2 + 2
//        4 + 1 + 9 + "." + (-3 + 10) + 11 / 3
//        8 + 6 * -2 + 4 + "0" + (2 + 5)
        String str = "hello 34 " + 2 * 4;  // string  + int ---> concat
        System.out.println("str = " + str);// hello 34 8
        String str2 = 7 + 2 + "(int) 2.0" + 2 * 2 + 2;
//           9 + "(int) 2.0"+ 4 + 2
//        "9(int) 2.042"
        System.out.println("str2 = " + str2);

    }
}

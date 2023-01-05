package gunler.gun20_18_11_2022;

public class LoopsTekrar {
    public static void main(String[] args) {
        // for while do-while foreach
        // degisken olmali ---> byte, short char (int)onemli olan  double float baslagic degeri atayacagiz
        // condition(sart)
        // degiskenin degeri degisecek
        // block
        for (int i = 0; i < 3; i++) {// 1 2 3
            //  1          2     3
            System.out.println(i);//4block   sonuc = 0 1 2
        }
//siralama = 1   2  4  3  2  4  3   2  4  3  2  bu sirala cok onemli
        for (int i = 0; i < 3; i++) {//
            //  1          2     3
            System.out.print(i + " " + " *");// ln kaldripta dene
            System.out.println("  hello");
        }
        for (int i = 0; i < 10; i++) {//
            //  1          2     3
            System.out.print(i + " " + " *");// ln kaldripta dene
            System.out.println("  hello");
            ++i;
        }
        for (int i = 0; i <= 10; ++i) {
            //    1       2      3
            System.out.print(i + " " + "*");// 0 *hello
            System.out.println("hello");    // 2 *hello
            //  4 *hello
            ++i;//1 3
        }
        for (int n = 10; n > 0; n--) {// 10 9 8 7 6 5 4 3 2 1
            System.out.print("decrement ");// decrement10
            System.out.println(n);        // decrement9
        }
        System.out.println("block disi");
    }
}
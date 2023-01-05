package gunler.gun12_04_11_2022;

public class UnaryTekrar {
    public static void main(String[] args) {
        //increment decrement artis ve azalma
        int a = 10;
        // //increment degisken degerini 1 artirir
        ++a; // degiskenim adindan once kulanlirsa preincrement
        System.out.println(a);
        a++;
        System.out.println(a);
        a = -12;
        System.out.println("a = " + a);
        a = 12;
        --a;
        System.out.println("a = " + a);
        a--;
        System.out.println("a = " + a);
        a = 10;
        System.out.println(a++ + a++ + a++);// son a++ dan sorasi aliyoir
        //                 10     11    12
        System.out.println("a = " + a);//13
        a = 10;
        System.out.println(a++ + a++ * 2);
        //                  10 + 11  *2   11*2+10 = 32
        a = 10;
        System.out.println(a++ + ++a * 2);
        //                  10+   12  *2  = 34
        a = 10;
        int b = a++;
        int c = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


        int not = 10;
        int sinif = 5;
        if (not > 75) {
            sinif++;
            // sinif= sinif +1;
            sinif += 1;
        } else {
            // sinif--;
            //  sinif = sinif = -1;
            sinif -= 1;
        }
        System.out.println("sinif = " + sinif);
    }
}

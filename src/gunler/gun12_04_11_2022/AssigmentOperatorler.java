package gunler.gun12_04_11_2022;

public class AssigmentOperatorler {
    public static void main(String[] args) {
        // =    ==
        int a = 10;
        int b = 10 + a;
        //System.out.println("b = " + b);// compiler sagdon sola calisiyor ilk olarak esitliugin sagini hesapliyor
        System.out.println("a==b = " + (a == b));
        System.out.println(a != b);
        a = a + 10; // 10 +10   a=20
        a += a;
        System.out.println("a = " + a);
        a = a / 4;
        a /= 2;
        System.out.println("a = " + a);
        a = a * 4;
        a *= 4;
        System.out.println("a = " + a);
        a = a % 3;
        System.out.println("a = " + a);
        a = 7;
        a %= 2;
        System.out.println("a = " + a);
    }
}

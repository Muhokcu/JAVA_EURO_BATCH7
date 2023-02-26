package gunler.gun12_04_11_2022;

public class AssigmentOperatorler {
    public static void main(String[] args) {

            //   =  ==
            int a = 10;
            int b = 10 + a;// compiler sagdan sola dogru calisiyor ilk olarak esitligin sagini compile ediyor

            System.out.println("a==b = " + (a == b));
            System.out.println(a != b);

            a = a + 10;// 10 + 10  a---> 20
            a += a;//  a+a ------> 20 + 20 ---> 40
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
            a %= 2;// a % 2 ----> 7 / 2 kalan = 1
            System.out.println("a = " + a);

        }
}

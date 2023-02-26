package gunler.gun09_31_10_2022;

public class UnarySoru {
    public static void main(String[] args) {
        int n = 5;
        n--; //-- decrement value of variable n by 1 ,    5-1

        System.out.println(n);
//        ------------------------------------
        int no = 5;
        int n2 = -200;
        n2 = no++;//  n2=5 atama sonrasi nonun degerin9i 1 artiriyor no=6
//        no?  n2?
        System.out.println("no = " + no);//6
        System.out.println("n2 = " + n2);//5

//                ------------------------------------------------------------

        int i = 3;
        i++;// i = 4
        System.out.println(i);// 4
        ++i;// 4 + 1= 5
        System.out.println(i);// 5
        System.out.println(++i);// 6
        System.out.println(i++);// 6
        System.out.println(i);// 7


        int a = 30;
        int b = --a;// 29
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        b = a--;// b 29 a nindegeri atama sonrasi 1 eksiliyor ve a 28 oluyor
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        int c = a + b;// a operand b operand  + operator

        a = 10;
        a = -20;

        int r = 6;
        System.out.println("r=: " + r++);//6    DIKKAT!!!!!
        System.out.println("r=: " + r);// 7
        int x = 6;
        System.out.println("x=: " + x--);// 6   DIKKAT!!!!!
        System.out.println("x=: " + x);// 5
        int y = 6;
        System.out.println("y=: " + ++y);//7
        int p = 6;
        System.out.println("p=: " + --p);//5

    }
}

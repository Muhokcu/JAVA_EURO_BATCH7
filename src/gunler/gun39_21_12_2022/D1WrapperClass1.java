package gunler.gun39_21_12_2022;

public class D1WrapperClass1 {
    public static void main(String[] args) {
        int num1 = 5;
        Integer num2 = new Integer(5);
        Integer num3 = new Integer("5");
        Integer num4 = new Integer(num1);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        // == operatoru u objectelrin ayni olup oladigini, bir anlamda reference
        // aquals() methodu obkectlerin degerlerini karsilastirir

        System.out.println(num2 == num3);// false
        System.out.println("num2.equals(num3) = " + num2.equals(num3));

        double d1 = 25.5;
        Double d2 = new Double(25.5);
        Double d3 = new Double("25.5");
        Double d4 = new Double(d1);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);
        System.out.println(d1 + d2 + d3 + d4);


        char c1 = 'c';
        Character c2 = new Character('c');
        Character c3 = new Character(c1);
        //Character c4 = new Character("c");// Error  == Character Class String argument kabul etmez
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        byte b1 = 10;
        Byte b2 = new Byte((byte) 10); // byte range inde bir valau argumant oalrak cast edilmesi gerekir
        Byte b3 = new Byte("10");
        Byte b4 = new Byte(b1);// byte deger olarak olusturulmus va
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        boolean bol1 = true;
        Boolean bol2 = new Boolean(false);
        Boolean bol3 = new Boolean("false");
        Boolean bol4 = new Boolean(bol1);
        System.out.println("bol1 = " + bol1);
        System.out.println("bol2 = " + bol2);
        System.out.println("bol3 = " + bol3);
        System.out.println("bol4 = " + bol4);


    }
}

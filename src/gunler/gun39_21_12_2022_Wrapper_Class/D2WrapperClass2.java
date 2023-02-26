package gunler.gun39_21_12_2022_Wrapper_Class;

public class D2WrapperClass2 {
    public static void main(String[] args) {

        int num1 = 5;
        Integer num2 = Integer.valueOf(5);
        Integer num3 = Integer.valueOf("5");
        Integer num4 = Integer.valueOf(num1);


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num2==num3 = " + (num2 == num3));


        // valueOf methodu cashing ile yani eger ayni object mevcut ise onu tekrar kullanarak object create ettigi icin
        // (ki hafiza kullanimi acisindan bu sebeple daha tercih edilebilir yontem) == operatoru ayni objecte refere edildiginden true donuyor
        System.out.println(num2 == num3); // true
        System.out.println(num2.equals(num3)); // true

        float f1 = 25.5f;
        Float f2 = Float.valueOf(25.5f);
        Float f3 = Float.valueOf("25.5F");
        Float f4 = Float.valueOf(f1);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println("f1==f4 = " + (f2 == f3));
        System.out.println("f2.equals(f3) = " + f2.equals(f3));
        System.out.println("-----------------------------");

        char c1 = 'c';
        Character c2 = Character.valueOf('c');
        Character c3 = Character.valueOf(c1);
        // Character c4 = Character.valueOf("c"); // Error / Character Class String argument kabul etmez
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c1==c2 = " + (c2 == c3));

        short b1 = 10;
        Short b2 = Short.valueOf((byte) 10);// byte range inde bir value argument olarak cast edilmesi gerekir
        Short b3 = Short.valueOf("10");
        Short b4 = Short.valueOf(b1); // byte deger olarak olusturulmus variable cast gerekmeksizin argument olarak gonderilebilir
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
        System.out.println("b1==b2 = " + (b1 == b3));

        boolean bol1 = false;
        Boolean bol2 = Boolean.valueOf(false);
        Boolean bol3 = Boolean.valueOf("false");
        Boolean bol4 = Boolean.valueOf(bol1);
        System.out.println("bol1 = " + bol1);
        System.out.println("bol2 = " + bol2);
        System.out.println("bol3 = " + bol3);
        System.out.println("bol4 = " + bol4);

        System.out.println("bol1==bol2 = " + (bol1 == bol2));

    }
}

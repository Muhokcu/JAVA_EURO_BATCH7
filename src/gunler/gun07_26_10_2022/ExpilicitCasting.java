package gunler.gun07_26_10_2022;

public class ExpilicitCasting {

    public static void main(String[] args) {

        double myDouble = 9.99;
        int myInt = (int) myDouble; // Expilicit Casting - Manual Conversion
        double myDouble2 = myInt; // Data kaybini tekrar geri alabilmek bu sekilde mumkun degil

        System.out.println("myDouble = " + myDouble);
        System.out.println("myInt = " + myInt);
        System.out.println("myDouble2 = " + myDouble2);

        double d = 100.4;
        long l = (long) d; // Expilicit Casting - data kaybi soz konusu
        int i = (int) l; // Expilict Casting - data kaybi soz konusu degil ancak yine de otomatik yapilmiyor, casting gerekiyor

        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("i = " + i);
    }
}

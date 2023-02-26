package gunler.gun07_26_10_2022;

public class CastingToChar {

    public static void main(String[] args) {

        char ch;
        int num = 65;
        ch = (char) num; // Explicit Casting
        System.out.println("char deger = " + ch);

        int num2 = ch; // Implicit Casting
        System.out.println("int deger = " + num2);

        // Boolean can not be casted to any primitive
        boolean bl = true;
        //int i = (int) bl;

    }
}

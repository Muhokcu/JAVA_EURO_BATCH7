package gunler.gun07_26_10_2022;

public class TypePromotion {

    public static void main(String[] args) {

        short num1 = 10;
        short num2 = 20;
        short sum;
        //sum = num1 + num2;
        int sum2 = num1 + num2;
        sum = (short)(num1 + num2);

        System.out.println("sum = " + sum);
        System.out.println("sum2 = " + sum2);

        byte b1 = 2;
        byte b2;
        // b2 = b1 * 2;
        int b3 = b1 * 2;
        b2 = (byte) (b1 *2);

        System.out.println("b3 = " + b3);
        System.out.println("b2 = " + b2);
    }
}

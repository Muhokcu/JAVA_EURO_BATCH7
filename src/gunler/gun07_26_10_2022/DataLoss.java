package gunler.gun07_26_10_2022;

public class DataLoss {

    public static void main(String[] args) {

        byte b;
        int i = 257;
        double d = 323;

        // byte range is between -128... 127 and starts counting from scratch
        // b % 256 = 1 // Data loss
        b = (byte) i;
        System.out.println("int deger i = " + i + " , byte deger b = " + b);

        // b % 256 = 67 // Data Loss - range + kusurat
        b = (byte) d;
        System.out.println("double deger d = " + d + " , byte deger b = " + b);

    }
}

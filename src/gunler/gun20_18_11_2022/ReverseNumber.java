package gunler.gun20_18_11_2022;

public class ReverseNumber {
    public static void main(String[] args) {
        //123456


//        son = numara % 10;
//        numara = numara / 10;
//        son = (son * 10) + (numara % 10);// 65
////             6   * 10     12345%10 -->5
//        numara = numara / 10;//1234
//        son = (son * 10) + numara % 10;
        int numara = 12345;
        int son = 0;
        System.out.println("numara = " + numara);
        while (numara > 0) {// 123456
            son = (son * 10) + (numara % 10);// son rakami almak icin
            numara = numara / 10;//  1
        }
        System.out.println("son = " + son);
        numara = 12345678;
        System.out.println("numara = " + numara);
        son = 0;
        do {
            son = (son * 10) + (numara % 10);// son rakami almak icin
            numara = numara / 10;//  1
        } while (numara > 0);
        System.out.println("son = " + son);
    }
}

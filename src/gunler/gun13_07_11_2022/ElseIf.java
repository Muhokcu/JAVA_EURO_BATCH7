package gunler.gun13_07_11_2022;

public class ElseIf {
    public static void main(String[] args) {
        int numara = 50;

        if (numara > 0) {
            System.out.println("numara 0 dan buyuktur");
        } else if (numara == 0) {
            System.out.println("numara o a esittir");
        } else {
            System.out.println("numara o dan kucuktur");
        }
        System.out.println("merhaba java");
        if (numara > 100) {
            System.out.println("numara 100 den buyuktur");
        } else if (numara > 70) {
            System.out.println("numara 70 den buyuktur");
        } else if (numara > 40) {
            System.out.println("numara 40 dan buyuktur");// sadece birini calistirir ilk hangisi ise o calisir

        } else if (numara > 20) {
            System.out.println("numara 20 den buyuktur");
        } else if (numara % 2 == 0) {
            System.out.println("numara cift sayidir");
        }
        System.out.println("if bitti");

        if (numara>20){
            System.out.println("numara buyuktur 20");
        }

    }
}

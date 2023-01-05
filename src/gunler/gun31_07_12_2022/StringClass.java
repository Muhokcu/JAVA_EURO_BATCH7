package gunler.gun31_07_12_2022;

public class StringClass {
    public static void main(String[] args) {

        // 1. Yontem String literal ile object create etme
        String s = "Hello";
        System.out.println("str = " + s);


        // 2. Yontem new keyword ile object create etme
        String s2 = new String("Hello");
        System.out.println("str2 = " + s2);
        String str1 = new String("EuroStudy");
        String str2 = "EuroStudy";
        String str3 = "EuroStudy";
        String str4 = new String("EuroStudy");
        System.out.println(str1 == str2);// iki farkli object oldugu icin false donuyor
        System.out.println(str1 == str3);// iki farkli object oldugu icin false donuyor
        System.out.println(str1 == str4);// iki farkli object oldugu icin false donuyor
        System.out.println(str2 == str3);// ayni object oldugu icin true donuyor
        System.out.println(str2 == str4);// iki farkli object oldugu icin false donuyor
        System.out.println(str3 == str4);// iki farkli object oldugu icin false donuyor


    }
}

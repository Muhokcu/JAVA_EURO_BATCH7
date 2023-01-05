package gunler.gun22_22_11_2022;

public class DebuggingMethodCallkod5 {
    public static void main(String[] args) {


        System.out.println("Main method icerisindeyim: line 7");
        method();
        System.out.println("Tekrar main method icerisindeyim: line 9");
        method();
        System.out.println("Tekrar main method icerisindeyim: line 11");
        method();
        System.out.println("Tekrar main method icerisindeyim: line 13");


    }


    public static void method() {
        System.out.println("Method icerisindeyim : line 19");
    }
}

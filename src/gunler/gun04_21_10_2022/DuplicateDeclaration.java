package gunler.gun04_21_10_2022;

public class DuplicateDeclaration {
    public static void main(String[] args) {
        int a = 200;
        int b = 300;
        System.out.println("b = " + b);// b nin degeri 300
        b = 900;// hata vermez
//        int b = 500; hata verir


    }
}

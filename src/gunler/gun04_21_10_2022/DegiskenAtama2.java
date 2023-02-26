package gunler.gun04_21_10_2022;

public class DegiskenAtama2 {

    public static void main(String[] args) {
        int a = 20;
//        int a = 30; iki defa bir degiskeni declare edemezsiniz
        a = 300;
        int b = 30;
        a = b;//   a = 30;
        System.out.println("a = " + a);
        float f = 30.40f;
        float f1 = f;
        System.out.println("f1 = " + f1);
//        float f3;// main metot icinde deger atamadiginiz degiskenleri kullanamazsiniz
//        // baslangic degeri atamalisiniz
//        System.out.println("f3 = " + f3);
        int d;
//        System.out.println("d = " + d); aldigimiz hata variable d might not have been initialized
    }
}
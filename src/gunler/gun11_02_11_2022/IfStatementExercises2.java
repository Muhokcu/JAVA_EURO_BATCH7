package gunler.gun11_02_11_2022;

public class IfStatementExercises2 {
    public static void main(String[] args) {
        //
        //
        //Eger bir sayi 5 in katlari ise hi Five yazan
        // Eger sayi 2 ye bolunelilir ise hi Even yazan bir program yazin
        int number = 30;
        if (number % 5 == 0) {
            System.out.println("Hi Five");

        }
        if (number % 2 == 0) {
            System.out.println("Hi Even ");

            int yas = 18;
            if (yas >= 18) {
                System.out.println("oy kullanabilir");
            }
            // Write a java program to find max number for given numbers (positves)
            // num1 =11  num2 =1  num3 = 33
            int num1 = 11;
            int num2 = 1;
            int num3 = 33;

            if (num1 > num2 && num1 > num3) {
                System.out.println(num1 + " is the max number");
            }
            if (num2 > num1 && num2 > num3) {
                System.out.println(num2 + " is the max number ");

            }
            if (num3 > num1 && num3 > num2) {
                System.out.println(num3 + " is the max number");
            }


        }
    }
}

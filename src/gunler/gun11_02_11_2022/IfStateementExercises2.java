package gunler.gun11_02_11_2022;

public class IfStateementExercises2 {

    public static void main(String[] args) {

        // Write a program If the number is a multiple of 5, the program displays 'Hi Five'.
        // If the number is divisible by 2, it displays/prints 'Hi Even'
        // Eger bir sayi  5 in katlari ise "Hi Five" yazan
        // Eger sayi 2 ye bolunebilir ise "Hi Even" yazan bir program yazin

        int number = 30;

        if(number%5 == 0){
            System.out.println("Hi Five");
        }

        if(number%2 == 0){
            System.out.println("Hi Even");
        }

        /*
        Write a program, declare int variable user age. Then program will show us is
        The user eligible to vote or not.. (Rule: vote age >=18) USER AGE = 15  do not print anything
        USER AGE = 18  Eligible to vote
         */
        // Bir kisinin oy kullanmaya uygun olup olmadigini gosteren bir program yazin

        int age = 18;

        if (age >= 18){
            System.out.println("Eligible to Vote");
        }

        // Write a Java program to find max number for given numbers (positive)
        // num1 = 11, num2 = 1, num3 = 33

        int num1 = 11;
        int num2 = 1;
        int num3 = 33;

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the max number");
        }
        if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the max number");
        }
        if (num3 > num1 && num3 > num2){
            System.out.println(num3 + " is the max number");
        }

    }
}

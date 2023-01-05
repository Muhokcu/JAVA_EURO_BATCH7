package gunler.gun36_16_12_2022;

import java.util.Scanner;

public class D1_ReverseString {
    public static void main(String[] args) {

        // Kullanicidan alidiginiz String i ters ceviren bir program yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir String deger giriniz!");
        String original = input.nextLine();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("String orginal : " + original);
        System.out.println("Ters cevrilmis string : " + reversed);

    }
}

package gunler.gun30_06_12_2022;
        //1. olarak  Scanner class import edilmeli

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // 2. olarak Scanner objectini create et
        Scanner input = new Scanner(System.in);
        //ucuncu olarak girdi yapilir data tipini uygun methodu cagir
        int girdi = input.nextInt();
        System.out.println("girdi = " + girdi);

    }
}

package gunler.gun62_07_02_2023_Error_Handling_Handling_Exceptions2;

import java.util.Scanner;

public class UserdefinedException {
    public static void main(String[] args) throws AgeException {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean devam = true;
        while (devam) {
            System.out.print("Lutfen yasinizi giriniz : ");

            age = Integer.parseInt(scanner.nextLine());

            try {
                if (age < 18) {
                    throw new AgeException("Yasiniz bu araci kullanmaya uygun degildir\n" + "Lutfen gecerli bir yas giriniz.");
                    //  System.out.println("Yasiniz bu araci kullanmaya uygun degildir\n" +
                    //     "Lutfen gecerli bir yas giriniz.");
                } else {
                    devam = false;
                    System.out.println("Yasiniz bu araci kullanmaya uygundur");
                }

            } catch (AgeException yasExcp) {
                System.out.println("Catch blok");
                System.out.println(yasExcp.getMessage());


            }
        }
    }
}




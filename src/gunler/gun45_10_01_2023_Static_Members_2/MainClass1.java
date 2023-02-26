package gunler.gun45_10_01_2023_Static_Members_2;

public class MainClass1 {

    static int sayi = 5;
    int number = 0;

    static {
        //Static code block
        System.out.println("Executing static block-2.");
        System.out.println("sayi = " + sayi);
    }

    //Non-Static block-instance-object block
    {
        System.out.println("Executing non-static block");
        number = 500;
        for (int i = 0; i < 5; i++) {
            System.out.println("Merhaba.I am in non-static block.");
        }
        System.out.println("Number in non-static block = " + number);
    }

    MainClass1() {//Constructor block
        System.out.println("Executing constructor block.");
        this.number = 35;
        System.out.println("Number in constructor = " + number);
    }

    public static void main(String[] args) {
        MainClass1 main1 = new MainClass1();
        System.out.println("Executing main method.");
        main1.number = 34;
        System.out.println("MainClass.sayi = " + MainClass1.sayi);
    }

    static {
        //Static code block
        System.out.println("Executing static block-1.");

    }


}



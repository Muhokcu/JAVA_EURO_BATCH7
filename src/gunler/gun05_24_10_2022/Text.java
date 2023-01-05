package gunler.gun05_24_10_2022;

public class Text {
    public static void main(String[] args) {
        // primitive data type lari kucuk harfla yaziyoruz
        int no = 100;
        String sehir = "Istanbul";
        // jvm
        // stack        ve         heap
        // sehir      ------>     Istanbul
        String bugun;
        bugun = "Pazartesi";
        System.out.println("bugun = " + bugun);
        bugun = "Sali";
        System.out.println("bugun = " + bugun);
//        bugun = "100000";
        int numara = 100000;
        System.out.println(sehir + bugun + " gunu cok guzel");
        System.out.println(2 + 2);
        String str = "100";
        String str2 = "200";
        System.out.println(100 + 200);
        System.out.println("100"+"200");
        System.out.println(str + str2);// 100200
        System.out.println("100"+200);
        System.out.println("A"+"b"+"c");
    }
}

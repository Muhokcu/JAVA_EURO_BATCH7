package gunler.gun21_21_11_2022;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println("continue oncesi");
            if (i == 3 || i == 5) {
                continue;// bununla 3 ve 5 i   pas geciyor
            }
            System.out.println(i);
            //countine oncesi
            //0
            //countine oncesi
            //1
            //countine oncesi
            //2
            //countine oncesi
            //countine oncesi
            //5
            //countine oncesi
            //countine oncesi
            //6
            for (int n = 0; n < 10; n++) {
                System.out.println(n);
                if (n == 2) {
                    break;
                }
                System.out.println("block icindeyiz");
            }
            System.out.println("block disindayiz");
            //0
            //block icindeyiz
            //1
            //block icindeyiz
            //2
            System.out.println("------------------------------");
        }
        for (int n = 0; n < 6; n++) {
            System.out.println(n);
            if (n == 2) {
                continue;
            }
            System.out.println("yaz");
        }
        System.out.println("kis");
        //0
        //yaz
        //1
        //yaz
        //2
        //3
        //yaz
        //4
        //yaz
        //5
        //yaz
        //kis





    }
}

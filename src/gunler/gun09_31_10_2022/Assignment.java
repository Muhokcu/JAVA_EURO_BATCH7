package gunler.gun09_31_10_2022;

public class Assignment {
    public static void main(String[] args) {
        int numara; // declaration
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        numara = 120;
        numara = numara + 30;// 120+30
        System.out.println("numara = " + numara);//150
        numara += 30;// numara = numara + 30 =====> 150+30= 180
        System.out.println("numara = " + numara);//180

        numara = 10;
        numara = numara * 5; // 10*5==>50
        numara *= 5;
        System.out.println("numara = " + numara);//250

        numara = numara / 10;
        System.out.println("numara = " + numara);//25

        numara /= 5;// numara= numara / 5
        System.out.println("numara = " + numara);//5
        numara = numara % 3; // 5/3 kalan 2
        System.out.println("numara = " + numara);
        numara %= 2;// numara = numara % 2
        System.out.println("numara = " + numara);//0
        numara = 100;
        int a = 10;
        numara = numara - a;
        numara -= a;
        System.out.println("numara = " + numara);//80
        numara = 80 - a;
        numara = 10;
        numara++;//numara = numara + 1  11
        numara += 1;// numara++ 12
        numara--;//numara =numara - 1 12-1= 11
        --numara;//numara=numara - 1 =====>11-2 = 10
        numara--;
        System.out.println("numara = " + numara);

    }
}

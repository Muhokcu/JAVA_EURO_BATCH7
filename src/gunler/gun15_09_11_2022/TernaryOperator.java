package gunler.gun15_09_11_2022;

public class TernaryOperator {
    public static void main(String[] args) {
        int x, y;
        x = 20;
        // condition false dondugu icin : statement isleme alindi ve 90 assing edildi
        y = (x == 1) ? 61 : 90;
        System.out.println("y = " + y);
        // condition true dondugu icin : statement isleme alindi ve 61 assing edildi

        y = (x == 20) ? 61 : 90;
        System.out.println("y = " + y);
        System.out.println("--------------");
        boolean b;
        int a = 5; //String a = "5"; de oalabilir

        b = (a == 5) ? true : false; // burda 5 i tirnak icinde olmasi lazim
        System.out.println("b = " + b);

    }
}

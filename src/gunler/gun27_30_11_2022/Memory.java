package gunler.gun27_30_11_2022;

public class Memory {
    public static void main(String[] args) {
        String sehir = "Istanbul";
        String sehir2 = "Istanbul";
        System.out.println(sehir2 == sehir);
        String yeniSehir = new String("Istanbul");
        System.out.println("yeniSehir = " + yeniSehir);
        System.out.println("sehir = " + sehir);
        System.out.println(sehir == yeniSehir);
        int a = 10;
        int b1 = 10;
        byte b = 5;
        System.out.println(a == b);
        // lifo last in firs out
        new Memory();
        Memory hafiza = new Memory();
        hafiza.gb = 20;
        Memory hafiza2 = new Memory();
        hafiza2.gb = 30;
        System.out.println("hafiza.gb = " + hafiza.gb);
        System.out.println("hafiza2.gb = " + hafiza2.gb);
        Memory hafiza5 = hafiza;
        System.out.println("hafiza5.gb = " + hafiza5.gb);
        hafiza5.gb = 30;
        System.out.println("hafiza.gb = " + hafiza.gb);

    }

    int gb;

    public static void print() {
        int a = 10;
        System.out.println(a);
        print2();

    }

    static void print2() {
        int b = 10;
        System.out.println(b);

    }
}

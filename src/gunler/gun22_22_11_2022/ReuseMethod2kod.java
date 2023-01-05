package gunler.gun22_22_11_2022;

public class ReuseMethod2kod {
    public static void main(String[] args) {
        // proje icerisinde ayni methodu defalarca cagirmak mumkun
        System.out.println("Ahmet geldi");
        selam();
        System.out.println("Ayse geldi");
        selam();
        System.out.println("Mehmet geldi");
        selam();
        System.out.println("Elif geldi");
        selam();

    }
    public static void selam(){
        System.out.println("selam");
    }
}

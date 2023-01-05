package gunler.gun05_24_10_2022;

public class Yuz {
    public static void main(String[] args) {
        String elma = "100";
        System.out.println("elma = " + elma);
        int numara = 100;
        System.out.println(elma + numara);//100100
        String elmaYuz = 100 + elma + 100;// 100100100
        System.out.println("elmaYuz = " + elmaYuz);
        System.out.println(100+200+""+100+200+300);// 300100200300
    }
}

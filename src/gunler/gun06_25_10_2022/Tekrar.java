package gunler.gun06_25_10_2022;

public class Tekrar {
    public static void main(String[] args) {
        int numara = 123456;
        String sehir = "Londra";
        System.out.println("sehir = " + sehir);
        sehir = "Istanbul";

        // stack                                  heap
        //  sehir   ----------->                   Londra
        //numara=123456
        System.out.println("sehir = " + sehir);
        sehir = "Oslo";
        System.out.println("sehir = " + sehir);

    }
}

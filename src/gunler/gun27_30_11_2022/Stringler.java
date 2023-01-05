package gunler.gun27_30_11_2022;

public class Stringler {
    public static void main(String[] args) {
        String sehir = "Istanbul";
        String yeniSehir = "Istanbul";
        System.out.println(yeniSehir == sehir);
        String city = new String("Istanbul");
        System.out.println(city == sehir);
        sehir = "Izmir";
        city = "Kars";
        city = new String("Mardin");
        city = "Izmir";
        String sehir5 = "Izmir";

    }
}

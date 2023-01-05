package gunler.gun21_21_11_2022;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("hello");//0 1 2  yazdirir 3 gorunce yazdirmaz bitirir
        }
        System.out.println("block disindayiz");
    }
}

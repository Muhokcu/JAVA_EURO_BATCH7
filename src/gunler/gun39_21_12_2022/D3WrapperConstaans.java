package gunler.gun39_21_12_2022;

public class D3WrapperConstaans {
    public static void main(String[] args) {
        System.out.println(Byte.MIN_VALUE);
        // Byte.MIN_VALUE = 126; // Wrapper Class icerisindeki constantlar final oldugu icin yeni bir deger assign edilemez
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int minValue = Integer.MIN_VALUE;
        System.out.println("minValue = " + minValue);

        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

    }
}

package gunler.gun33_12_12_2022;

public class FirstTwo {
    public static void main(String[] args) {
        // verilen stringin ilk iki karakterini yazdiralim
        String str = "Kastamonu";
        //            012345678
        str.substring(0,2);// 0 1
        System.out.println(str.substring(0, 2));
        String substring = str.substring(0, 2);
        System.out.println("substring = " + substring);

    }
}

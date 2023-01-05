package gunler.gun06_25_10_2022;

public class AritmetikOperatorler3 {
    public static void main(String[] args) {
        System.out.println(10 + 20 * 5 + 20 / 2 + 30 % 7 - 2);
//                        10   +  100   +    10  +      2  - 2
        System.out.println(10 + 20 * 5 + 20 / 2 + 30 % (7 - 3));
//                          10  +  100  + 10  +2                           4
    }
}

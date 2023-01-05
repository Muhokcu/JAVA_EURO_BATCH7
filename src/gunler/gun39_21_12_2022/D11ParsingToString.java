package gunler.gun39_21_12_2022;

public class D11ParsingToString {
    public static void main(String[] args) {

        Integer num = Integer.valueOf(30);
        String num2 = String.valueOf(num);
        num2 = num2 + num;
        System.out.println("num2 = " + num2);


        Integer num3 = Integer.valueOf(54);
        String num4 = num3.toString();
        num4 = num3 + num4;
        System.out.println("num4 = " + num4);
    }
}

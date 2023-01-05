package gunler.gun40_02_01_2023;
import java.util.ArrayList;

public class D2_RemoveInteger {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        System.out.println(nums.size() == 0);

        nums.add(1);
        nums.add(34);
        nums.add(56);
        nums.add(75);
        nums.add(54);
        nums.add(86);
        nums.add(95);

        System.out.println(nums.size());
        System.out.println(!nums.isEmpty());
        System.out.println(nums.size() == 0);

        System.out.println(nums.toString());

        nums.remove(5); // 5 inci siradakini listeden cikariuyor
        System.out.println(nums.toString());

        System.out.println("nums.remove(1) = " + nums.remove(1));
        System.out.println(nums.toString());

        // nums.remove(95); / error

        nums.remove(new Integer(95));
        System.out.println(nums.toString());

        Integer num = 56;
        System.out.println("nums.remove(num) = " + nums.remove(num)); // true
        System.out.println(nums.toString());

        System.out.println("nums.remove(num) = " + nums.remove(num)); // false
        System.out.println(nums.toString());

        System.out.println("---------------------");

        ArrayList<String> carList = new ArrayList<>();

        carList.add("Ferrari");
        carList.add("BMW");
        carList.add("Mercedes");

        System.out.println("carList.toString() = " + carList.toString()); // [Ferrari, BMW, Mercedes]

        carList.set(1,"Opel");// bununla bmw ile opel yer degistiriyor
        System.out.println("carList.toString() = " + carList.toString()); // [Ferrari, Opel, Mercedes]

    }
}

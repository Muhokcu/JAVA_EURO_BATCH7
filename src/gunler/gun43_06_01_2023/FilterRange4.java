package gunler.gun43_06_01_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FilterRange4 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 5, 7, 2, 8, 9, 12, 15, 11, 9, 4));

        int num1 = 5;
        int num2 = 10;

        filterRange(numbers, 5, 10).toString();

        Collections.sort(numbers);
        System.out.println("numbers = " + numbers.toString());

    }

    public static ArrayList filterRange(ArrayList<Integer> list, int min, int max) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer num : list) {
            if (num >= min && num <= max) {
                temp.add(num);
            }

        }
        list.removeAll(temp);
        return list;
    }
}

package gunler.gun40_02_01_2023;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(30,25,12));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(7,25,18,30,67,12,56));

        System.out.println("list1 = " + list1.toString());
        System.out.println("list2 = " + list2.toString());

        list2.removeAll(list1);
        System.out.println("list2 = " + list2.toString());
    }
}

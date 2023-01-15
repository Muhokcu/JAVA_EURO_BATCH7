package gunler.gun43_06_01_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;

public class AliCozum6 {


    public static void main(String[] args) {
        // Liste icerisnde bulunan ek kucuk sayiyi listenin nasina yerlestierm method nyaz

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(45, 74, 28, 98, 3, 56, 887, 12, 2, 46));

    }

    public static ArrayList minToFront(ArrayList<Integer> list) {

        Integer min = Integer.MAX_VALUE;

        for (Integer each : list) {

            if (min > each) {
                min = each;
            }
        }
        list.set(0, min);

        return list;
    }
}
package gunler.gun43_06_01_2023;
import java.util.Arrays;

import java.util.ArrayList;
public class MehmetCozum5 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmet", "Can", "Semih", "Cem", "Kaan", "Tom", "Max", "Tim", "Michael"));

        System.out.println("addingStar(names,3) = " + addingStar(names, 3));

    }

    public static ArrayList addingStar(ArrayList<String> list, int karakter) {

        ArrayList<String> temp = new ArrayList<>();
        for (String isim : list) {
            if (isim.length() == karakter) {
                temp.add(isim);
            }
        }
        return temp;

    }
}
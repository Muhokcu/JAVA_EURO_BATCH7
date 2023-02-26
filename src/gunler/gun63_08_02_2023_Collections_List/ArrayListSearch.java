package gunler.gun63_08_02_2023_Collections_List;

import java.util.ArrayList;

public class ArrayListSearch {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Adana");
        cities.add("Konya");
        System.out.println("Cities : " + cities);
        System.out.println("cities.contains(\"Sivas\") = " + cities.contains("Sivas"));
        if (cities.contains("Adana")) {
            System.out.println("Aradiginiz sehir listede vardir");
            System.out.println("Index of sehir : " + cities.indexOf("Konya"));
        } else
            System.out.println("Aradiniz sehir listede yoktur");

        System.out.println("cities.get(4) = " + cities.get(2));


    }
}

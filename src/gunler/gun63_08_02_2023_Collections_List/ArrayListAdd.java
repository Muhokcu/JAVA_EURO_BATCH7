package gunler.gun63_08_02_2023_Collections_List;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Adana");
        cities.add("Konya");
        System.out.println("Cities : " + cities);


        ArrayList<String> cities1 = new ArrayList<>();
        cities1.add("Corum");
        cities1.add("Yozgat");
        cities1.add("Diyarbakir");
        cities1.add("Adiyaman");
        System.out.println("Cities1 : " + cities1);


        ArrayList<String> citiesToplam = new ArrayList<>();
//        for (String city : cities){
//            citiesToplam.add(city);
//
//        }
//        for (String city : cities1) {
//            citiesToplam.add(city);

        citiesToplam.addAll(cities);// butun listeyi birlestirmek icin
        citiesToplam.addAll(cities1);// butun listeyi birlestirmek icin

        System.out.println("citiesToplam = " + citiesToplam);
    }
}

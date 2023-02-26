package gunler.gun69_16_02_2023_Review;

import java.util.ArrayList;

public class ArrayListJoin {
    public static void main(String[] args) {
        System.out.println("Join two ArrayLists.");
        //Colors-1 Arraylist
        ArrayList<String> colors1 = new ArrayList<>();
        //Colors-2 Arraylist
        ArrayList<String> colors2 = new ArrayList<>();
        //Result Arraylist
        ArrayList<String> joinedArrayList = new ArrayList<>();

        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Black");
        colors1.add("White");
        colors1.add("Pink");
        System.out.println("Colors-1 : " + colors1);

        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Black");
        colors2.add("Pink");
        System.out.println("Colors-2 : " + colors2);

        // Classic way - for each
        for (String eleman : colors1) {
            joinedArrayList.add(eleman);

        }
        for (String eleman : colors2) {
            joinedArrayList.add(eleman);
        }
        System.out.println("joinedArrayList : " + joinedArrayList);
        joinedArrayList.clear();

        // ArrayList. addAll() method
        joinedArrayList.addAll(colors1);
        joinedArrayList.addAll(colors2);
        System.out.println("joinedArrayList : " + joinedArrayList);


    }
}

package gunler.gun69_16_02_2023_Review;

import java.util.ArrayList;

public class ArrayListExtract {
    public static void main(String[] args) {
        System.out.println("Extract subset of elements from ArrayList");
        // colors -1 ArrayList
        ArrayList<String> colors1 = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Black");
        colors1.add("White");
        colors1.add("Pink");
        System.out.println("Colors-1 : " + colors1);

        //0-3 arasi elemanlari baska bir listeye yaz
        int start = 1;// dahil
        int finish = 3;// haric
        for (int i = start; i < finish; i++) {
            result.add(colors1.get(i));
        }
        System.out.println("result = " + result);
        result.clear();

        //ArrayList. subList() methodu
        result.addAll(colors1.subList(1, 3));
        System.out.println("result = " + result);


    }
}

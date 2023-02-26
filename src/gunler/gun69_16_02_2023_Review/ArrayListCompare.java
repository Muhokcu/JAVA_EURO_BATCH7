package gunler.gun69_16_02_2023_Review;

import java.util.ArrayList;

public class ArrayListCompare {
    public static void main(String[] args) {
        System.out.println("Comparing two ArrayLists.");
        //Colors-1 Arraylist
        ArrayList<String> colors1 = new ArrayList<>();
        //Colors-2 Arraylist
        ArrayList<String> colors2 = new ArrayList<>();
        //Result Arraylist
        ArrayList<String> result = new ArrayList<>();

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

        /*for (String eleman: colors1){
            for (String eleman1: colors2){
                if(eleman.equals(eleman1)){
                    result.add("Yes");
                    break;
                }else {
                    result.add("No");
                    break;
                }
            }
        }*/
        //   System.out.println("Result : " + result);
      /*  for (int i = 0; i < colors1.size()-1; i++) {
            if( colors1.get(i).equals(colors2.get(i))){
                result.add("Yes");
            } else result.add("No");
        }
     System.out.println("Result : " + result);
*/
        for (String eleman:colors1){
            if(colors2.contains(eleman)){
                result.add("Yes");
            }else result.add("No");
        }
        System.out.println("Result : " + result);
        result.clear();

        for (String eleman: colors1){
            result.add(colors2.contains(eleman) ? "Yes":"No"); //Ternary ops.
        }
        System.out.println("Result : " + result);

    }
}

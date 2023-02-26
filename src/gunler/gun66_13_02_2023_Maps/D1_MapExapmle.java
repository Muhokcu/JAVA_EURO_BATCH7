package gunler.gun66_13_02_2023_Maps;

import java.util.HashMap;
import java.util.Map;

public class D1_MapExapmle {

    public static void main(String[] args) {

        //   Key    Value   Data types
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // retrieves values according to key
        System.out.println("Value of key A : " + map.get("A"));
        System.out.println("Value of key B : " + map.get("B"));
        System.out.println("Value of key C : " + map.get("C"));
    }
}
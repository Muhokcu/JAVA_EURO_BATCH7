package gunler.gun63_08_02_2023_Collections_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(34);
        System.out.println("linkedList = " + linkedList);
        linkedList.push(45); //ekleme yapiyor basa
        linkedList.push(5);
        System.out.println("linkedList = " + linkedList);
        List<Integer> liste = new ArrayList<>();
        liste.add(123);


        liste = new LinkedList<>();
        liste.add(1);


    }
}

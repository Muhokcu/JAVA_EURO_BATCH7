package gunler.gun64_09_02_2023_Collections_Queue_Set;

import java.util.ArrayDeque;

public class ArrayDequeueExample {

    public static void main(String[] args) {

        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(20);
        arrayDeque.add(10);
        arrayDeque.add(5);
        arrayDeque.add(15);

        System.out.println("arrayDeque = " + arrayDeque);

        // retrieves the first element
        System.out.println("ilk sayi  = " + arrayDeque.peekFirst());// ilk sayi
        // retrieves the last element
        System.out.println(arrayDeque.peekLast());//son sayi

        System.out.println(arrayDeque.poll());// ilk sayiyi cikarir
        System.out.println("arrayDeque = " + arrayDeque);

        arrayDeque.addFirst(30);// illk sayiya 30 atiyoruz
        System.out.println("arrayDeque = " + arrayDeque);
        System.out.println(arrayDeque.peekFirst());

        arrayDeque.addLast(40);// son sayiya 40 atiyoruz
        System.out.println("arrayDeque = " + arrayDeque);
        System.out.println(arrayDeque.peekLast());


    }
}

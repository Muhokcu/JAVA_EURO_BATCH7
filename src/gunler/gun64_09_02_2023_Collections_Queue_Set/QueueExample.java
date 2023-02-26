package gunler.gun64_09_02_2023_Collections_Queue_Set;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> que  = new LinkedList<>();
        que.add("Cemil");
        que.add("Ahmet");
        que.add("Mehmet");
        que.add("Beyza");

        // Fifo
        System.out.println("que = " + que);
        // fifo out / removes first element in the list

        String name = que.remove();// ilki cikartmis olduk
        System.out.println("name = " + name);
        System.out.println("que = " + que);

        name = que.poll(); // ilk siraya gecen yeni ismi bulmus olduk ve listeden cikardik
        System.out.println("name = " + name);

        System.out.println("que = " + que);

        name = que.peek();// listenin siradaki elemanini soyler // gets the first element in the order
        System.out.println("name = " + name);
        System.out.println("que = " + que);

        // poll ile remove arasindaki fark
        //que.poll();
        //que.poll();
        //que.poll();
        System.out.println("que = " + que);// hepsini cikarmis olmamiza ragmen hata vermiyor kac tane yazarsak yazalim hata vermiyor
        que.remove();
        que.remove();
        //que.remove();// fakat burda butun elemanlar ciktiktan sonra cikarmaya devam edersek hata veriyotr listede bisey yook ama sen cikarmaya calisiyorsu  diyor
        System.out.println("que = " + que);

        try {
            que.remove();// empty list with exception

        }catch (NoSuchElementException n){
            System.out.println("Your list is empty");

        }


        // NOT = EGER bitti HATAsini GORMEK ISTEMIYORSAK POLL, 0






    }
}

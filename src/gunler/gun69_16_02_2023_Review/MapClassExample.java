package gunler.gun69_16_02_2023_Review;

import java.util.HashMap;
import java.util.Map;

public class MapClassExample {
    public static void main(String[] args) {
        Map<Integer, PersonKisi> persons = new HashMap<>();

        PersonKisi personKisi = new PersonKisi(12345, "Ahmet Falanca", "Istanbul/Turkey");
        persons.put(personKisi.getTCNO(), personKisi);
        personKisi = new PersonKisi(56789, "John Smith", "Colarado/USA");
        persons.put(personKisi.getTCNO(), personKisi);

        System.out.println("TCNO = 12345 sahsin bilgileri : " + persons.get(12345));
        System.out.println("Map listesindeki kayit sayisi : " + persons.size());
        for (Map.Entry<Integer, PersonKisi> kisiEntry : persons.entrySet()) {
            System.out.println("TCNO : " + kisiEntry.getKey());
            System.out.println("Adi : " + kisiEntry.getValue().getName());
            System.out.println("Adress : " + kisiEntry.getValue().getAddress());
            System.out.println("-----------------------");


        }


    }
}

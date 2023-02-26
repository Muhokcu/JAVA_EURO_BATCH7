package gunler.gun69_16_02_2023_Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapMultipleValue {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> aracMarkaModelListe = new HashMap<>();

        aracMarkaModelListe.put("Honda", new ArrayList<>());
        aracMarkaModelListe.get("Honda").add("Civic");
        aracMarkaModelListe.get("Honda").add("Accord");
        aracMarkaModelListe.get("Honda").add("Jazz");

        aracMarkaModelListe.put("Toyota", new ArrayList<>());
        aracMarkaModelListe.get("Toyota").add("Corolla");
        aracMarkaModelListe.get("Toyota").add("Avensis");
        aracMarkaModelListe.get("Toyota").add("Yaris");

        aracMarkaModelListe.put("Mercedes", new ArrayList<>());
        aracMarkaModelListe.get("Mercedes").add("E 250D");
        aracMarkaModelListe.get("Mercedes").add("A 180 XLs");
        aracMarkaModelListe.get("Mercedes").add("GLS 63");

        System.out.println("aracMarkaModelListe : " + aracMarkaModelListe);


        System.out.println("Arac marka modelleri");
        System.out.println("---------------------");
        for (Map.Entry<String, ArrayList<String>> entry : aracMarkaModelListe.entrySet()) {
            System.out.println(entry.getKey().toUpperCase());
            for (String eleman : aracMarkaModelListe.get(entry.getKey())) {
                System.out.println("\t" + eleman);
            }

            // System.out.println(entry);
        }

        System.out.println();
        System.out.println("Istenen Markanin Modellerini listeler.");
        String marka;
        marka = "Mercedes";
        System.out.println(marka + " aracin modelleri :");

        for (String eleman : aracMarkaModelListe.get(marka)) {
            System.out.println("\t" + eleman);
        }

    }
}

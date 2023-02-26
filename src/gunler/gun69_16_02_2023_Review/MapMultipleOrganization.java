package gunler.gun69_16_02_2023_Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapMultipleOrganization {

    public static void personelListesi(String birim, Map<String, ArrayList<String>> organizasyon){
        System.out.println(birim + " Müdürlüğünde çalışanların listesi");
        System.out.println("------------------------------------------");
        for (String calisan: organizasyon.get(birim)){
            System.out.println(calisan);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<String>> organizasyonMap = new HashMap<>();

        organizasyonMap.put("AR-GE Müdürlüğü",new ArrayList<>());
        organizasyonMap.put("Finans Müdürlüğü",new ArrayList<>());
        organizasyonMap.put("Personel Müdürlüğü",new ArrayList<>());

        organizasyonMap.get("AR-GE Müdürlüğü").add("Ahmet Efendi");
        organizasyonMap.get("AR-GE Müdürlüğü").add("Hasan Efendi");
        organizasyonMap.get("AR-GE Müdürlüğü").add("Ayşe Hanım");

        organizasyonMap.get("Finans Müdürlüğü").add("Fatma Hanım");
        organizasyonMap.get("Finans Müdürlüğü").add("Kazım Bey");

        organizasyonMap.get("Personel Müdürlüğü").add("Can Bey");
        organizasyonMap.get("Personel Müdürlüğü").add("Ali Bey");
        organizasyonMap.get("Personel Müdürlüğü").add("Zehra Hanım");

        // System.out.println(organizasyonMap);

       /* System.out.println("Personel Müdürlüğünde çalışanların listesi");
        System.out.println("------------------------------------------");
        for (String calisan: organizasyonMap.get("Personel Müdürlüğü")){
            System.out.println(calisan);
        }
        System.out.println();
        System.out.println("Finans Müdürlüğü çalışanların listesi");
        System.out.println("------------------------------------------");
        for (String calisan: organizasyonMap.get("Finans Müdürlüğü")){
            System.out.println(calisan);
        }*/

        personelListesi("Finans Müdürlüğü",organizasyonMap);
        System.out.println();
        personelListesi("AR-GE Müdürlüğü",organizasyonMap);

    }
}

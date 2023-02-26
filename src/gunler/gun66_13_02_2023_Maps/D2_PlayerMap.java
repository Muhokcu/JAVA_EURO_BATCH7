package gunler.gun66_13_02_2023_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class D2_PlayerMap {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        players.add("Messi");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        Map<Integer, String> playerNumbers = new LinkedHashMap<>();
        playerNumbers.put(10, "Messi");
        playerNumbers.put(7, "Ronaldo");
        playerNumbers.put(11, "Rivaldo");
       // playerNumbers.put("Bale" , 11); boyle yaparsak hata aliriz
        System.out.println("oyuncularin forma numaralari : " + playerNumbers);

        System.out.println("10 numarali formayi giyen futbolcu : " + playerNumbers.get(10));
        System.out.println("7 numarali formayi giyen futbolcu : " + playerNumbers.get(7));
        System.out.println("11 numarali formayi giyen futbolcu : " + playerNumbers.get(11));
        System.out.println("11 numarali formayi giyen futbolcu : " + playerNumbers.get("Rivaldo")); // null


    }
}

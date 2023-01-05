package gunler.gun30_06_12_2022;

import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dairenini yari Capini giriniz");
        double yaricap = sc.nextDouble();
        double daireninAlani = yaricap * yaricap * Math.PI;
        System.out.println("dairenin Alani = " + daireninAlani);
    }
}

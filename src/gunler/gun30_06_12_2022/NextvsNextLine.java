package gunler.gun30_06_12_2022;
import java.util.Scanner;

public class NextvsNextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir veri giriniz...");

        // Space a kadar veri kabul edip kalanini bastirmiyor
        String veri = input.nextLine(); // Merhaba Nasilsin
        // Merhaba

        // DIKKAT!!!
//      Eger ayni scanner objectini kullanarak, ayni execution da sirali olarak
//      once next() daha sonra nextLine() methodu kullanarak tek (space kullanmadan) bi
//      girdi yapildiginda ikinci veri icin data alinmadan execution tamamlaniyor
//        System.out.println("Lutfen bir daha veri giriniz...");
//        String veri2 = input.nextLine();

        // Satir atlayana (Enter) kadar veri kabul edip aradaki spaceleri de bastiriyor
        //String veri = input.nextLine(); // Merhaba Nasilsin
        // Merhaba Nasilsin

        System.out.println("veri = " + veri);
        //System.out.println("veri = " + veri2);
    }
}
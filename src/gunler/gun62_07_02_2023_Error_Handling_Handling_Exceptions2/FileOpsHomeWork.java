package gunler.gun62_07_02_2023_Error_Handling_Handling_Exceptions2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOpsHomeWork {
    //Bir text dosyasını satır satır okuyup Integer veri tipine dönüştürülebilecek olan satırları
    //Integer veri tipine dönüştürüp bir ArrayList e ekleyip sonucu yazdıran bir program yazınız.

    public static void main(String[] args) {
        File file = new File("src/gunler/gun62_07_02_2023_Error_Handling_Handling_Exceptions2/Data.txt");
        Scanner satirOku = null;
        ArrayList<Integer> sayilar = new ArrayList<>();
        int sayi;

        try {
            satirOku = new Scanner(file);
            while (satirOku.hasNextLine()) {
                String satir = satirOku.nextLine();
                System.out.println("Okunan satır : " + satir);
                try {
                    sayi = Integer.parseInt(satir.trim());//trim() baştan ve sondan boşlukları siler.
                    sayilar.add(sayi);
                    System.out.println("Okunan satır integer a çevrildi ve ArrayList e eklendi.");

                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Okunan satır Integer veri tipine dönüştürülemedi!");
                    System.out.println("Sonraki satırla ilgili işleme devam ediyorum.");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya sistemde bulunamadı!");
            //throw new RuntimeException(e);
        }

        System.out.println("--------------------------------------");
        System.out.println(sayilar);

    }
}
package gunler.gun62_07_02_2023_Error_Handling_Handling_Exceptions2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileOps {
    public static void main(String[] args) {

        File file = new File("src/gunler/gun62_07_02_2023_Error_Handling_Handling_Exceptions2/Data.txt");
        Scanner satirOku = null;
        try {
            satirOku = new Scanner(file);
            System.out.println("Dosyayı sistemde buldum.");
           /* System.out.println(satirOku.nextLine());
            System.out.println(satirOku.nextLine());
            System.out.println(satirOku.nextLine());
            System.out.println(satirOku.nextLine());*/

            while (satirOku.hasNextLine()) {
                System.out.println(satirOku.nextLine());
            }
            System.out.println(satirOku.nextLine()); // Olmayan bir satırı okumaya çalıştığımızdan "NoSuchElementException" hatası oluşur.
            System.out.println("Dosyanın bütün satırlarını hatasız okudum.");
        } catch (NoSuchElementException olmayanSatir) {
            System.err.println("Dosyada olmayan bir satır okunmaya çalışılıyor.");
        } catch (FileNotFoundException foundException) {
            System.err.println("Dosya sistemde yok.");
        } catch (Exception exp) {
            exp.printStackTrace();
        } finally {
            System.out.println("Finally bloğundayım.");
            // satirOku = null;
            satirOku.close();
        }

    }
}

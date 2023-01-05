package gunler.gun29_05_12_2022;
import java.time.LocalDate;

public class Kisil {
    int kisiYas;


    public void yasHesapla(int dogumYili) {
        LocalDate localDate = LocalDate.now();
        int yas = localDate.getYear() - dogumYili;
        //          2022                  1970
        System.out.println("yas = " + yas);
        kisiYas = yas;
    }
}
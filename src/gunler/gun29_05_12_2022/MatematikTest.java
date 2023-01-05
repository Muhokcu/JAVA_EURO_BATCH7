package gunler.gun29_05_12_2022;
import gunler.gun27_30_11_2022.*;
import gunler.gun28_02_12_2022.*;


import java.util.ArrayList;

public class MatematikTest {
    public static void main(String[] args) {
        Matematik islem = new Matematik();
        islem.toplama(40, 60);
        double carpmaSonuc = islem.carpma(10, 30);
        System.out.println("carpmaSonuc = " + carpmaSonuc);
        double besUssu = islem.karesi(5, 5);// 5 5 5 5 5
        System.out.println("besUssu = " + besUssu);
        ArrayList<String> list = new ArrayList();
        Banka banka = new Banka();
        MerkezBankasi merkezBankasi = new MerkezBankasi();
        AsalSayilar asalSayilar = new AsalSayilar();

    }
}


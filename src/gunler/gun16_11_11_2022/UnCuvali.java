package gunler.gun16_11_11_2022;

import javax.swing.*;

public class UnCuvali {
    public static void main(String[] args) {
        //bir ve 5 kiloluk paketler var 1 ve 5 kiloluklar
        // hedefelenen kiloya ulasilip ulasilmadignin hesapla

        int beslik = 6;
        int birlik = 15;
        int talep = 40;
        boolean cevap = false;
        if (beslik * 5 >= talep) {
            if (birlik * 1 >= talep % 5) {
                cevap = true;
            }
        } else {
            if (birlik * 1 >= talep - beslik * 5) {
                cevap = true;
            }
        }
        System.out.println("cevap : " + cevap);
    }
}





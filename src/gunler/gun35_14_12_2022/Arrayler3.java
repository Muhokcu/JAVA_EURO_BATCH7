package gunler.gun35_14_12_2022;

public class Arrayler3 {
    public static void main(String[] args) {
        int[] sayilar = new int[]{95, 10, 7, 15, 53, 22, 35, 40, 19, 150};
        int toplam = 0;
        int max = 0;
        int min = 0;
        for (int sayi : sayilar) {
            if (sayi > max) {
                max = sayi;

            }
        }
        System.out.println("max = " + max);
        min = sayilar[0];
        for (int sayi : sayilar) {
            if (sayi < min) {
                min = sayi;

            }
        }
        System.out.println("min = " + min);
        for (int sayi : sayilar) {
            toplam = sayi+ toplam;
            System.out.println("toplam = " + toplam);

        }// tekrar bak = tekrar baktim daha iyi anladim fakat iki nokta mevzusunu tekrarla
    }
}

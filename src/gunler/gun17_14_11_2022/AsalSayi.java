package gunler.gun17_14_11_2022;

public class AsalSayi {
    public static void main(String[] args) {
        int numara = 311;
        int i = 2;
        int sayac = 0;
        while (i < numara) {
            if (numara % i == 0) {
                System.out.println(numara + " Bu sayiya bolunebilir : " + i);
                sayac++;
            }
            i++;
        }
        if (sayac == 0) {
            System.out.println("Bu sayi asal bir sayidir");
        } else {
            System.out.println("sayi asal degildir");
        }
    }
}

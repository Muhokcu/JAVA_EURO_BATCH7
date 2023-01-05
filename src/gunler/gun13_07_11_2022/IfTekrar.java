package gunler.gun13_07_11_2022;

public class IfTekrar {
    public static void main(String[] args) {
        int numara = 300;
        boolean sonuc = numara > 0;
        if (sonuc) {
            System.out.println("numara 0 dan buyuktur");
            numara += 5; // numara = numara + 5
        }
        System.out.println("numara = " + numara);
        int numara2 = 30;
        if (numara > 20) {
            // block icinde bir degisken olusturursak bu degiskeni sadece bu block icnde kullabiliriz
            System.out.println("numara pozitif sayidir.");
            System.out.println("numara2 = " + numara2);
            numara2 += 10;

        }
        System.out.println("numara2 = " + numara2);
        if (numara > 0) {
            System.out.println("sayi pozitiftir");
        } else {
            System.out.println("sayi pozitif degildir");
        }
    }
}

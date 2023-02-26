package gunler.gun45_10_01_2023_Static_Members_2.Market;

import java.util.Date;

public class Market {
    public static void main(String[] args) {
        System.out.println("ABC Markete hos Geldiniz");

        Urun urun1 = new Urun("Elma", 15,5,"Yiyecek");
        Urun urun2 = new Urun("Peynir", 150,1,"Yiyecek");
        Urun urun3 = new Urun("Deterjan", 250,1,"Temizlik");
       // Urun urun4 = new Urun("Elma", 15,5,"Yiyecek");
        Sepet sepet = new Sepet();
        sepet.sepeteEkle(urun1);
        sepet.sepeteEkle(urun2);
        sepet.sepeteEkle(urun3);


        //  System.out.println(sepet);
        Fatura fatura = new Fatura(new Date(),sepet);
        System.out.println(fatura);
        System.out.println();

        Sepet sepet1 = new Sepet();
        sepet1.sepeteEkle(urun1);

        Fatura fatura1 = new Fatura(new Date(),sepet1);
        System.out.println(fatura1);

    }
}

package gunler.gun38_20_12_2022;

//import gunler.gun29_05_12_2022.Kisi;

import gunler.gun38_20_12_2022.D2Kisi;

public class D3TelefonRehberiProgrami {
    public static void main(String[] args) {
        System.out.println("Telefon Rehberi Programi");
        D2Kisi[] rehberim = new D2Kisi[3];

        int[] sayilar = new int[3];
        D2Kisi kisi = new D2Kisi();
     //   D2Kisi.ad = "Ahmet";
        kisi.adres = "Ankara/Turkiye";
        kisi.telNo = 116733123;

         kisi = new D2Kisi();
         kisi.ad = "Ayla";
         kisi.adres ="London/England";
         kisi.telNo = 541651516;



        kisi.printInfo();


    }
}

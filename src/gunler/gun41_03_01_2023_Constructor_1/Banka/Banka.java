package gunler.gun41_03_01_2023_Constructor_1.Banka;

import java.util.ArrayList;

public class Banka {
    String adi;
    String adresi;
    int hesapNo = 1000;
    ArrayList<Musteri> musteriler = new ArrayList<>();

    public Banka(String adi, String adresi) {
        this.adi = adi;
        this.adresi = adresi;
    }

    public void musteriEkle(Musteri musteri){
        this.hesapNo++;
        musteri.hesapNo = this.hesapNo;
        this.musteriler.add(musteri);
        System.out.println(musteri.hesapNo + " hesap nolu " + musteri.adi + " isimli müşteri bankaya eklendi.");
    }

    public void paraCek(Musteri musteri,double paraMiktari){
        if(musteri.bakiye >= paraMiktari){
            // musteri.bakiye = musteri.bakiye - paraMiktari;
            musteri.bakiye -= paraMiktari;
            musteri.showInfo();
        }else {
            System.out.println("Bakiyeniz " + paraMiktari + " TL para çekmeye müsait değil!");
            System.out.println("Enfazla " + musteri.bakiye + " TL kadar para çekebilirsin.");
        }
    }

    public void showInfo(){
        System.out.println("Bankamızdki müşterilerin bilgileri aşağıdadır.");
        System.out.println("----------------------------------------------");
        System.out.println("Bankanın adı   : " + this.adi);
        System.out.println("Bankanın adresi: " + this.adresi);
        System.out.println("----------------------------------------------");
        for (Musteri musteri:this.musteriler){
           /* System.out.println("**** Müşteri Bilgileri ****");
            System.out.println("----------------------------");
            System.out.println("Müşterinin adı           : " + musteri.adi);
            System.out.println("Müşterinin kimlik no     : " + musteri.kimlikNo) ;
            System.out.println("Müşterinin hesp no       : "  + musteri.hesapNo);
            System.out.println("Müşterinin telefon no    : " + musteri.telefonNo);
            System.out.println("Müşterinin hesap bakiyesi: " + musteri.bakiye);*/

            musteri.showInfo();
        }
    }
}

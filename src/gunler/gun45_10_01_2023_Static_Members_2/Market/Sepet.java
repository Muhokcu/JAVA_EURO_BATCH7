package gunler.gun45_10_01_2023_Static_Members_2.Market;

import java.util.ArrayList;

public class Sepet {
    ArrayList<Urun> urunler;
    double urunlerToplamFiyat;

    Sepet(){

        this.urunler= new ArrayList<>();

    }
    public void sepeteEkle(Urun urun){
        this.urunler.add(urun);
    }

    public double sepetToplmaFiyat(){


        for (Urun urun : this.urunler){
            this.urunlerToplamFiyat +=urun.getToplamFiyat();

        }
        return urunlerToplamFiyat;
    }

    public String toString(){

        String str = "";
        str +="Sr      Urununun Adi        Birim Fiyat       Miktari       Toplam F          Kategori\n";
        str +="Sr      -----------        ------------       ---------     --------         ----------\n";
        int srNo=1;
        for (Urun urun: urunler){
            str +=srNo++ +"\t" + urun;
        }
        str += "\n                         Urunlerin toplam Fiyat";
        return str;
    }




}

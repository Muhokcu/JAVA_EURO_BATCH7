package gunler.gun45_10_01_2023_Static_Members_2.Market;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fatura {
    static int id=1000;
    static int faturaNo;
    static String firmaAdi;
    static String firmaAdresi;
    static String webAdres;
    static String mailAdres;
    static String firmaTelNo;

    Date faturaTarihi;
    Sepet sepet;

    static {
        firmaAdi = "ABC Market Ticaret Şirketi";
        firmaAdresi= "ABC Plaza 4.kat no:1234 İstanbul/Türkiye";
        webAdres = "www.abcmarket.com";
        mailAdres = "market@abcmarket.com";
        firmaTelNo = "+90 216 34567890";
    }

    public Fatura(Date faturaTarihi, Sepet sepet){
        this.faturaTarihi = faturaTarihi;
        this.sepet = sepet;
        id++;
        faturaNo = id;
    }

    public String toString(){
        SimpleDateFormat tarihFormat = new SimpleDateFormat("dd-MMMM-yyyy  HH:mm:ss");
        String str = firmaAdi + "\n";
        str += firmaAdresi + "\n";
        str += "            Web adresi  : " + webAdres +"\n";
        str += "            Mail        : " + mailAdres+"\n";
        str += "            Telefon     : " + firmaTelNo + "\n\n";
        str += "Fatura no: " + faturaNo + "              Tarih/Saat : " + tarihFormat.format(faturaTarihi) + "\n";
        str += "-----------------------------------------------------------------------\n";
        str += sepet;
        return str;
    }
}

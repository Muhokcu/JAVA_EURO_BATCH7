package gunler.gun52_23_01_2023.Constructor;

public class Ogrenci {
    private String ad;
    private String soyAd;
    private int okulNo;

    public Ogrenci() {   // bu constructor

    }

    public Ogrenci(String ad, String soyAd, int okulNo) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.okulNo = okulNo;

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }
}

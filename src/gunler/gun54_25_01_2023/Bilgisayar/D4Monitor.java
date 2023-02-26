package gunler.gun54_25_01_2023.Bilgisayar;

public class D4Monitor {
    private String model;
    private String ureticiFirma;
    private int ekranBoyutu;
    private D2Cozunurluk cozunurluk; //  boyle yapinca composing yapmis oluyoruz

    public D4Monitor(String model, String ureticiFirma, int ekranBoyutu, D2Cozunurluk cozunurluk) {
        this.model = model;
        this.ureticiFirma = ureticiFirma;
        this.ekranBoyutu = ekranBoyutu;
        this.cozunurluk = cozunurluk;
    }

    public String getModel() {
        return model;
    }

    public String getUreticiFirma() {
        return ureticiFirma;
    }

    public int getEkranBoyutu() {
        return ekranBoyutu;
    }

    public D2Cozunurluk getCozunurluk() {
        return cozunurluk;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", ureticiFirma='" + ureticiFirma + '\'' +
                ", ekranBoyutu=" + ekranBoyutu +
                ", cozunurluk=" + cozunurluk +
                '}';
    }
}

package gunler.gun54_25_01_2023.Bilgisayar;

public class D3Kasa {

    private String model;
    private String ureticiFirma;
    private String gucKaynagi;
    private D1Boyut boyut; // boyle yapinca composing oluyor

    public D3Kasa(String model, String ureticiFirma, String gucKaynagi, D1Boyut boyut){
        this.model = model;
        this.ureticiFirma = ureticiFirma;
        this.gucKaynagi = gucKaynagi;
        this.boyut = boyut;
    }

    public void calistir(){
        System.out.println("Bilgisayar baslatildi");
    }

    public String getModel(){
        return model;
    }

    public String getUreticiFirma(){
        return ureticiFirma;
    }

    public String getGucKaynagi(){
        return gucKaynagi;
    }

    public D1Boyut getBoyut(){
        return boyut;
    }

    @Override
    public String toString() {
        return "Kasa{" +
                "model='" + model + '\'' +
                ", ureticiFirma='" + ureticiFirma + '\'' +
                ", gucKaynagi='" + gucKaynagi + '\'' +
                ", boyut=" + boyut +
                '}';
    }
}

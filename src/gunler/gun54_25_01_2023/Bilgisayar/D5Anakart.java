package gunler.gun54_25_01_2023.Bilgisayar;

public class D5Anakart {
    private String model;
    private String ureticiFirma;
    private int ramSlot;
    private int cardSlot;
    private String bios;

    public D5Anakart(String model, String ureticiFirma, int ramSlot, int cardSlot, String bios) {
        this.model = model;
        this.ureticiFirma = ureticiFirma;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }

    public void programyukle(String programAdi) {
        System.out.println(programAdi + " isimli program yukleniyor");
    }

    public String getModel() {
        return model;
    }

    public String getUreticiFirma() {
        return ureticiFirma;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public String getBios() {
        return bios;
    }

    @Override
    public String toString() {
        return "Anakart{" +
                "model='" + model + '\'' +
                ", ureticiFirma='" + ureticiFirma + '\'' +
                ", ramSlot=" + ramSlot +
                ", cardSlot=" + cardSlot +
                ", bios='" + bios + '\'' +
                '}';
    }
}
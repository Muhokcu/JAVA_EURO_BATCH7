package gunler.gun54_25_01_2023.Bilgisayar;

public class D6Bilgisayar {

    private D5Anakart anakart;
    private D4Monitor monitor;
    private D3Kasa kasa;

    public D6Bilgisayar(D5Anakart anakart, D4Monitor monitor, D3Kasa kasa) {
        this.anakart = anakart;
        this.monitor = monitor;
        this.kasa = kasa;
    }

    public D5Anakart getAnakart() {
        return anakart;
    }

    public D4Monitor getMonitor() {
        return monitor;
    }

    public D3Kasa getKasa() {
        return kasa;
    }

    @Override
    public String toString() {
        return "Bilgisayar{" +
                "anakart=" + anakart +
                ", monitor=" + monitor +
                ", kasa=" + kasa +
                '}';
    }
}
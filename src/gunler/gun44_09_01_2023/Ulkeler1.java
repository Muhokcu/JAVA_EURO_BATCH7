package gunler.gun44_09_01_2023;

public class Ulkeler1 {
    // Static variable-Class variable
    static int ulkelerSayac;

    // Instance variables
    int dummyCounter;
    String name;
    String ulkeKod;
    int intTelCode;

    public Ulkeler1(String name, String ulkeKod, int intTelCode) {
        ulkelerSayac++;
        dummyCounter++;
        this.name = name;
        this.ulkeKod = ulkeKod;
        this.intTelCode = intTelCode;
    }

    @Override
    public String toString() {
        return "Ulkeler1{" +
                "dummyCounter=" + dummyCounter +
                ", name='" + name + '\'' +
                ", ulkeKod='" + ulkeKod + '\'' +
                ", intTelCode=" + intTelCode +
                '}';
    }
}

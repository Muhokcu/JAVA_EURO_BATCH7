package gunler.gun45_10_01_2023_Static_Members_2;

public class Araba {
    String marka;
    String model;

    public Araba(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}



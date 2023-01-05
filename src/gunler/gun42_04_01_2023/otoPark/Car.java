package gunler.gun42_04_01_2023.otoPark;

public class Car {
    String marka;
    String plakasi;

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", plakasi='" + plakasi + '\'' +
                '}';
    }

    public Car(String marka, String plakasi) {
        this.marka = marka;
        this.plakasi = plakasi;


    }
}

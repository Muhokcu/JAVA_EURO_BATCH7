package gunler.gun51_20_01_2023_Riview.araba;

public class VehicleTest {
    public static void main(String[] args) {
        Car myCar = new Car(4,1000,"BMW");

        myCar.move();

        myCar.stop();

        myCar.honk();

        myCar.getWheels();

        System.out.println(myCar.wheels);


    }
}

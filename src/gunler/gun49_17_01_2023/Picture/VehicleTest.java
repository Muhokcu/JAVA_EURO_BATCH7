package gunler.gun49_17_01_2023.Picture;

public class VehicleTest {
    public static void main(String[] args) {
        Vecihle vecihle = new Vecihle();
        vecihle.name = "Arac";
        vecihle.start();


        Car car = new Car();
        car.brand = "BMW";
        car.name = "X1";
        car.honk();
        car.start();

        Plane plane = new Plane();
        plane.engineType = "Jet";
        plane.name = "AirBus";
        plane.taxi();
        plane.move();


    }


}

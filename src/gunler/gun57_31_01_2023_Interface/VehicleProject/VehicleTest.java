package gunler.gun57_31_01_2023_Interface.VehicleProject;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
        electricCar.stop();
        electricCar.charge();

        System.out.println(Vehicle.MAX_SPEED);
        System.out.println(ElectricVehicle.MAX_SPEED);
        System.out.println(ElectricVehicle.MAX_BATTERY_CAPACITY);
        System.out.println(Car.MAX_SPEED);
        System.out.println(ElectricCar.MAX_SPEED);
        System.out.println(ElectricCar.MAX_BATTERY_CAPACITY);

        // Variables defined in Interfaces can not be reached via object
        // as they have been default "public, final, static"
        // car.MAX_SPEED
        // electricVehicle.MAX_BATTERY_CAPACITY

    }
}

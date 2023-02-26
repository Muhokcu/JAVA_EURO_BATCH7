package gunler.gun56_30_01_2023_Abstraction.VehicleProject;

public class VehicleTest {
    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("Red");
        car.drive();

        Truck truck = new Truck();
        truck.setColor("Blue");
        truck.drive();

        Motocycle motocycle = new Motocycle();
        motocycle.setColor("Yellow");
        motocycle.drive();

        Bicycle bicycle = new Bicycle();
        bicycle.setColor("Black");
        bicycle.drive();

    }
}

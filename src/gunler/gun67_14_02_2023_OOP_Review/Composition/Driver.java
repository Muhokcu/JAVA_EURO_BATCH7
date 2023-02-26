package gunler.gun67_14_02_2023_OOP_Review.Composition;
public class Driver {

    private String name;
    private Car car;

    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }
}

package gunler.gun56_30_01_2023_Abstraction.VehicleProject;

public class Car extends Vehicle{
    public Car(){
        this.wheels = 4;
    }

    public void drive(){
        System.out.println("Driving a " + color + " car with " + + wheels + " wheels.");
    }
}

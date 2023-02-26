package gunler.gun56_30_01_2023_Abstraction.VehicleProject;

public class Bicycle extends Vehicle{
    public Bicycle(){
        this.wheels = 2;
    }

    public void drive(){
        System.out.println("Driving a " + color + " bicycle with " + + wheels + " wheels.");
    }
}

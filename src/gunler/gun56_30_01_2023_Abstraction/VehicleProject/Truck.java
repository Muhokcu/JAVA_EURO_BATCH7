package gunler.gun56_30_01_2023_Abstraction.VehicleProject;

public class Truck extends Vehicle  {
    public Truck(){
        this.wheels = 6;
    }

    public void drive(){
        System.out.println("Driving a " + color + " truck with " + + wheels + " wheels.");
    }

}

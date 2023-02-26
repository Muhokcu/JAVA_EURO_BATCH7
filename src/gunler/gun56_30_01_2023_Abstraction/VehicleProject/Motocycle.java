package gunler.gun56_30_01_2023_Abstraction.VehicleProject;

public class Motocycle extends Vehicle{
    public Motocycle(){
        this.wheels = 2;
    }

    public void drive(){
        System.out.println("Driving a " + color + " motocycle with " + + wheels + " wheels.");
    }
}

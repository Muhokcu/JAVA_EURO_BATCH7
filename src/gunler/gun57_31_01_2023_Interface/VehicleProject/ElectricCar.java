package gunler.gun57_31_01_2023_Interface.VehicleProject;

public class ElectricCar implements ElectricVehicle {

    public void start(){
        System.out.println("Electric Car is started");
    }

    public void stop(){
        System.out.println("Electric Car is stopped");
    }

    public void charge(){
        System.out.println("Electric Car is charging");
    }
}

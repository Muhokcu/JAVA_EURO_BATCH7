package gunler.gun54_25_01_2023.Car;

public class Steering {

    private int size;

    public Steering(int size){
        this.size = size;
    }

    public void turn(int degree){
        System.out.println("Turning steering wheel by " + degree + " degrees with " + size + " cm size");
    }
}

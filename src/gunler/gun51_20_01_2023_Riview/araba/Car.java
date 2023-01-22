package gunler.gun51_20_01_2023_Riview.araba;

public class Car extends Vehicle {
    public String model;

    public Car(int wheels, int weight, String model) {


        super(wheels, weight);// calling the constructor of Super class
        this.model = model;

    }

    public void honk() {
        System.out.println("Cars can honk");
    }

    public void move() {
        super.move();// calling the method of Super Class
        System.out.println("Cars can move on the roads");
    }

    public void getWheels() {
        System.out.println("Number of wheels of the car is : " + super.wheels);// calling the instance variable of Super class
    }

}
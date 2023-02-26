package gunler.gun54_25_01_2023.Car;

public class Engine {
    private int horsePower;

    public Engine(int horsePower){
        this.horsePower = horsePower;
    }

    public void start(){
        System.out.println("Engine started with " + horsePower + " horsePower");
    }
}

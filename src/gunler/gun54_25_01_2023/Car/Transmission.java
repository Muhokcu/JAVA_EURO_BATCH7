package gunler.gun54_25_01_2023.Car;

public class Transmission {

    private int gears;

    public Transmission(int gears){// Constructor
        this.gears = gears;
    }

    public void shiftGear(int gear){// Parametre alan bir Method
        System.out.println("Shifting to gear " + gear + " out of " + gears);
    }

}

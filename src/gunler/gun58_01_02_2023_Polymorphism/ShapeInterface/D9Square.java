package gunler.gun58_01_02_2023_Polymorphism.ShapeInterface;

public class D9Square implements D7Shape{
    public double side = 5.0;

    public double getArea() {
        return side * side;
    }
}
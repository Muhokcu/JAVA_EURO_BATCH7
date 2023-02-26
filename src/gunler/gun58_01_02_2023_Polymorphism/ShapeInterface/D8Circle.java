package gunler.gun58_01_02_2023_Polymorphism.ShapeInterface;

public class D8Circle implements D7Shape{
    public double radius = 2.5;

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
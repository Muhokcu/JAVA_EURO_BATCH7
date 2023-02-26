package gunler.gun67_14_02_2023_OOP_Review.Abstraction.AbstractClass;


public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
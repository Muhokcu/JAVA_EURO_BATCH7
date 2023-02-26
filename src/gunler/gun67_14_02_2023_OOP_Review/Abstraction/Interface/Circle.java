package gunler.gun67_14_02_2023_OOP_Review.Abstraction.Interface;

public class Circle implements Drawable{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}


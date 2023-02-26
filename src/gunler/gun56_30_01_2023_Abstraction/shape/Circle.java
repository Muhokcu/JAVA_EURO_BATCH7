package gunler.gun56_30_01_2023_Abstraction.shape;

public class Circle extends Shape {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("Math.PI * radius * radius = " + Math.PI * radius * radius);

    }

    public void draw() {
        System.out.println("Drawing a circle with area : " + Math.PI * radius * radius);

    }
}

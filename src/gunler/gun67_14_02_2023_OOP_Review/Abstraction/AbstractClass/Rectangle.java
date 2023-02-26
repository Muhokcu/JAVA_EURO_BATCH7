package gunler.gun67_14_02_2023_OOP_Review.Abstraction.AbstractClass;

public class Rectangle extends Shape {

    double width;
    double heigth;

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getArea() {
        return width * heigth;
    }
}

package gunler.gun67_14_02_2023_OOP_Review.Abstraction.Interface;
public class Rectangle implements Drawable{

    double width;
    double heigth;

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and heigth " + heigth);
    }
}

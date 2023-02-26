package gunler.gun67_14_02_2023_OOP_Review.Abstraction.Interface;

public class DrawableTest {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3,4);
        rectangle.draw();

        Circle circle = new Circle(5);
        circle.draw();
    }
}

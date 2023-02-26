package gunler.gun67_14_02_2023_OOP_Review.Abstraction.AbstractClass;

public class ShapeTest {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.getArea());

        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
    }
}

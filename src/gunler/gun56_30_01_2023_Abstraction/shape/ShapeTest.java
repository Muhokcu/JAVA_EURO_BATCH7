package gunler.gun56_30_01_2023_Abstraction.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle =new Circle(5.66);
        circle.calculateArea();
        circle.draw();

        Square square = new Square(5);
        square.calculateArea();
        square.draw();

    }
}

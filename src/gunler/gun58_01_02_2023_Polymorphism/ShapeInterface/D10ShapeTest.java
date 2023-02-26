package gunler.gun58_01_02_2023_Polymorphism.ShapeInterface;

public class D10ShapeTest {
    public static void main(String[] args) {
        D7Shape[] shapes = new D7Shape[2];
        shapes[0] = new D8Circle();
        shapes[1] = new D9Square();

        // Interface yoluyla farkli class larda farkli sekilde implement edilen methodun
        // objectler uzerinden iterate edilmesi ile, ayni code, ancak farkli hareket
        // yani polimorpic hareketi gormus olduk
        for (D7Shape shape : shapes) {
            System.out.println("The area of the shape is : " + shape.getArea());
        }

    }
}

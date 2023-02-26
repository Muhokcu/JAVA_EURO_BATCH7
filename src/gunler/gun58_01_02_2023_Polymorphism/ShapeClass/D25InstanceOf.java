package gunler.gun58_01_02_2023_Polymorphism.ShapeClass;

public class D25InstanceOf {
    public static void main(String[] args) {
        D20Shape shape = new D22Circle();

        if (shape instanceof D23Triangle) {
            System.out.println("Triangle");
        } else if (shape instanceof D21Square) {
            System.out.println("Square");
        } else if (shape instanceof D22Circle) {
            System.out.println("Circle");

        }

    }
}

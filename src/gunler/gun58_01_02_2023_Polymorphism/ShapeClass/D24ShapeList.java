package gunler.gun58_01_02_2023_Polymorphism.ShapeClass;

import java.util.ArrayList;

public class D24ShapeList {
    public static void main(String[] args) {
        D20Shape[] shapes = new D20Shape[3];
        shapes[0] = new D21Square();
        shapes[1] = new D22Circle();
        shapes[2] = new D23Triangle();
        for (D20Shape shape : shapes) {
            System.out.println("shape.getClass().getName() = " + shape.getClass().getName());
        }

        ArrayList<D20Shape> shapeList = new ArrayList<>();
        shapeList.add(new D21Square());
        shapeList.add(new D22Circle());
        shapeList.add(new D23Triangle());
        for (D20Shape shape : shapeList) {
            System.out.println("shape.getClass().getSimpleName() = " + shape.getClass().getSimpleName());
        }

    }
}

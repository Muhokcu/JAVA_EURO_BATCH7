package gunler.gun67_14_02_2023_OOP_Review.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        //Shape shape = new Shape();
        Shape shape1 = new Rectangle(3,4);
        Shape shape2 = new Circle(5);

        //shape.getArea();
        shape1.getArea();
        shape2.getArea();

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Rectangle(3,4));
        shapeList.add(new Circle(5));

        for(Shape shapee : shapeList){
            System.out.println("The area of the shape is : " + shapee.getArea());
        }

    }
}

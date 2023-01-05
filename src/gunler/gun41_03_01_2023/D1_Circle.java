package gunler.gun41_03_01_2023;

public class D1_Circle {
    double radius = 3;

    /* double getArea() {
         double area = radius * radius * Math.PI;
         return 1.0;

     */
    double getArea() {
        return radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}

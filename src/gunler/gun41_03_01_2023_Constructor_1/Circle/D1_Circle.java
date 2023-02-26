package gunler.gun41_03_01_2023_Constructor_1.Circle;

public class D1_Circle {
    double radius;
    //No-argument Constructor
    D1_Circle(){
        System.out.println("Default no-argument constructor called/invoked");
        this.radius = 5;
    }

    //Parameterized constructor
    D1_Circle(double radius){
        System.out.println("Parameterize constructor called/invoked- value of = " + radius);
        this.radius = radius;
    }

    /* double getArea(){
        double area = radius * radius * Math.PI;
     return area;
     }*/
    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

}
package gunler.gun56_30_01_2023_Abstraction.shape;

public class Square extends Shape {
    public int side;
    public Square(int side){
        this.side=side;

    }
    public void calculateArea(){
        System.out.println("The area of Square : " + side*side);
    }


    public void draw() {
       // System.out.println(Math.PI * radius * radius);

    }
}

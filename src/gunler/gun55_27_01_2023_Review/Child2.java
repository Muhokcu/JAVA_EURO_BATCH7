package gunler.gun55_27_01_2023_Review;

public class Child2 extends Parent2{

    String name = "Child Class";

    public void print(){
        System.out.println("Class Name :" + name);
    }

    public void printParent(){
        System.out.println("Class Name :" + super.name);
    }
}

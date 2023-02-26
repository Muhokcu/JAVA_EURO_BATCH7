package gunler.gun58_01_02_2023_Polymorphism.RunTimePoly;

public class D6RunTimePolyTest {
    public static void main(String[] args) {
        // Run Time Polymorphism / Dynamic Polymorphism / Method Overriding

        D3Parent obj = new D3Parent();
        obj.print();

        D4Child1 obj1 = new D4Child1();
        obj1.print();

        D5Child2 obj2 = new D5Child2();
        obj2.print();

    }
}

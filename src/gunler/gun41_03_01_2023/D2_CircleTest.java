package gunler.gun41_03_01_2023;

public class D2_CircleTest {
    public static void main(String[] args) {
        D1_Circle daire1 = new D1_Circle();
        daire1.radius = 4;
        //  daire1.getArea();
        System.out.println(daire1.radius + " yaricapli Dairenin alani : " + daire1.getArea());
        // yada
        double alan = daire1.getArea();
        System.out.println(daire1.radius + " yaricapli Dairenin alani : " + alan);


        System.out.println(daire1.radius + " yaricapli Dairenin ceveresi : " + daire1.getPerimeter());

        // yada
        double cevre = daire1.getPerimeter();
        System.out.println(daire1.radius + " yaricapli Dairenin cevresi : " + cevre);
    }
}

package gunler.gun50_18_01_2023.ikinciOrnek;

public class Circle extends Shape {
    @Override
    void draw() { // overriding parents method of parent/super/base
        super.draw();// invoking/ calling method of parent/super/base
        System.out.println("I am drawing a circle");
    }
}

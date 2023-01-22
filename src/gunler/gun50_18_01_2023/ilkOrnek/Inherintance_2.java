package gunler.gun50_18_01_2023.ilkOrnek;

import gunler.gun50_18_01_2023.ilkOrnek.BChild;

public class Inherintance_2 {
    public static void main(String[] args) {
        //Inheritance
        //Basic-Single
        //Multi level-GrandFather-Father-Child
        //Hierarchical-Father-Child1,Child2...
        //Method overriding
        System.out.println("Inheritance-2 in Java ");
        BChild child1 = new BChild();
        BChild child2 = new BChild("Child");

        child1.setPrivateStr("Test setter");
        System.out.println("child1.getPrivateStr() = " + child1.getPrivateStr());
        child1.aMethodChild();

        System.out.println("child1.getPrivateStr() = " + child1.getPrivateStr());


    }
}

package gunler.gun50_18_01_2023.ilkOrnek;

import gunler.gun50_18_01_2023.ilkOrnek.AParent;

public class BChild extends AParent {
    String name;

    BChild() {
        super();// base class constructor
        System.out.println("Child Class constructor.");
    }

    BChild(String name) {
        this();// sub class constructor
        this.name = name;
    }

    public void aMethodChild() {
        super.parentFieldStr = "Assigment from child class";
        super.parentFieldInt = 10;
        super.setPrivateStr("Sub class setter asiignment");
    }

}

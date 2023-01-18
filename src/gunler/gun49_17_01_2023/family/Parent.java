package gunler.gun49_17_01_2023.family;


public class Parent extends GrandParent {

    String lastName;

    public Parent(String name, String lastName) {

        super(name);
        this.lastName = lastName;

    }
    public void display(){
        super.display();
        System.out.println("Lastname of parent is : " + lastName);
    }
}

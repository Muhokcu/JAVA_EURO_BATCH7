package gunler.gun51_20_01_2023_Review.animal;

public class Dog extends Animal {
    public String bread;

    public Dog(String name, int age, String bread) {
        super(name, age);
        this.bread = bread;

    }
    public void bark(){
        System.out.println(name+" is barking");
    }
}

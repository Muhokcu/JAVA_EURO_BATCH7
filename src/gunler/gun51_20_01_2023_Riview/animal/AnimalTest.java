package gunler.gun51_20_01_2023_Riview.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", 5, "Kangal");
        System.out.println(dog.name);
        System.out.println("dog.age = " + dog.age);
        System.out.println("dog.bread = " + dog.bread);
        dog.move();
        dog.eat();
        dog.bark();


        Cat cat = new Cat("Duman", 3, "Tekir");
        System.out.println(cat.name);
        System.out.println("cat.age = " + cat.age);
        System.out.println("cat.bread = " + cat.bread);
        cat.move();
        cat.eat();
        // cat.bark();

        Animal animal = new Animal("Poyraz", 10);
        System.out.println(animal.name);
        System.out.println("animal.age = " + animal.age);
        // System.out.println(animal.bread);
        animal.move();
        animal.eat();
        // animal.bark();
        // animal.meow();

        //System.out.println(animal.breat);





    }
}

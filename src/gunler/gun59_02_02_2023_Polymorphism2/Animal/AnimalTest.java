package gunler.gun59_02_02_2023_Polymorphism2.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        // Animal animal = new Animal("Animal",12,"Yellow",10); abstract class olduğundan instance oluşturulamaz
        /*Cat cat = new Cat("Mahur", 4, "Dark Grey", 5);
        System.out.println("cat = " + cat);
        cat.makeSound();
        cat.move();
        cat.eat();
        cat.swim();
        System.out.println("-------------------------------------------------");


         */

        Animal animal = new Cat("Mahur", 4, "Dark Grey", 5);
        Animal animal1 = new Dog("Karabas", 4, "Black", 14);

        animal.makeSound();
        animal1.makeSound();

        animal = new Bird("Cici Kus", 2, "Yellow", 1);
        animal.makeSound();


    }
}
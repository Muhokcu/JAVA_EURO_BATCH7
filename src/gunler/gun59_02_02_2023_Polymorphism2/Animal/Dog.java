package gunler.gun59_02_02_2023_Polymorphism2.Animal;

public class Dog extends Animal implements CanSwim {

    public Dog(String name, int age, String color, int weight) {
        super(name, age, color, weight);
    }

    @Override
    public void move() {
        System.out.println("I am dog and I can run.");
    }

    @Override
    public void makeSound() {
        System.out.println("I am dog and I can make sound like - Hav..hav");
    }

    @Override
    public void eat() {
        System.out.println("I am dog and I can eat only meat.");
    }

    @Override
    public void swim() {
        System.out.println("I am a dog and I can swim but not the other animals which live in see.");
    }
}
package gunler.gun59_02_02_2023_Polymorphism2.Animal;
public class Cat extends Animal implements CanSwim{

    public Cat(String name, int age, String color, int weight) {
        super(name, age, color, weight);
    }

    @Override
    public void move(){
        System.out.println("I am cat and I can run.");
    }

    @Override
    public void makeSound(){
        System.out.println("I am cat and I can make sound like - Miyav..miyav");
    }

    @Override
    public void eat(){
        System.out.println("I am cat and I can eat only meat. And, sometimes I may eat grass for special purpose.");
    }

    @Override
    public void swim() {
        System.out.println("I am a cat and I can swim but not the other animals which live in see.");
    }
}

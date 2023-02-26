package gunler.gun59_02_02_2023_Polymorphism2.Animal;
public class Bird extends Animal implements CanFly{


    public Bird(String name, int age, String color, int weight) {
        super(name, age, color, weight);
    }

    @Override
    public void move(){
        System.out.println("I am bird and I can walk. Rarely, I may run.");
    }

    @Override
    public void eat(){
        System.out.println("I am duck and I can wheat, corn and bread. And, sometimes I may eat worms.");
    }

    @Override
    public void makeSound(){
        System.out.println("I am bird and I can make sound like - Cik..cik");
    }

    @Override
    public void fly() {
        System.out.println("I am a duck and I can fly.");
    }
}
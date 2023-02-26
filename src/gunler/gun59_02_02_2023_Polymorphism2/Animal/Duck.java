package gunler.gun59_02_02_2023_Polymorphism2.Animal;
public class Duck extends Animal implements CanSwim,CanFly {

    public Duck(String name, int age, String color, int weight) {
        super(name, age, color, weight);
    }

    @Override
    public void move(){
        System.out.println("I am duck and I can walk. Rarely, I may run.");
    }

    @Override
    public void makeSound(){
        System.out.println("I am duck and I can make sound like - Vak..vak");
    }

    @Override
    public void eat(){
        System.out.println("I am duck and I can wheat, corn and bread. And, sometimes I may eat worms and fishes.");
    }

    @Override
    public void swim() {
        System.out.println("I am a duck and I can swim.");
    }

    @Override
    public void fly() {
        System.out.println("I am a duck and I can fly.");
    }
}

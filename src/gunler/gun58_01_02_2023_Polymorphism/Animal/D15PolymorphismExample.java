package gunler.gun58_01_02_2023_Polymorphism.Animal;


public class D15PolymorphismExample {
    public static void main(String[] args) {
        D11Animal a = new D11Animal();
        a.sound();
        D12Dog dog = new D12Dog();
        dog.sound();
        D13Cat cat = new D13Cat();
        cat.sound();
        D14Duck duck = new D14Duck();
        duck.sound();

        System.out.println("------------------");
        // polymorphis object creation

        D12Dog dog1 = new D12Dog();
        dog1.sound();
        D11Animal cat1 = new D13Cat();
        cat1.sound();
        D11Animal duck1 = new D14Duck();
        duck1.sound();




        System.out.println("--------------------");
        //Same object name same methods differnt behaviour / polymormhism
        D11Animal animal = new D11Animal();
        animal.sound();
        animal = new D12Dog();
        animal.sound();
        animal = new D13Cat();
        animal.sound();
        animal = new D14Duck();
        animal.sound();


    }
}

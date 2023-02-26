package gunler.gun59_02_02_2023_Polymorphism2.Animal;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private String Adress;
    private ArrayList<Cat> cats;
    private ArrayList<Dog> dogs;
    private ArrayList<Duck> ducks;
    private ArrayList<Bird> birds;
    private ArrayList<Animal> animals;// Animal Classini miras alan bbutun hayvanlari bu Arrayliste ekleyebilirim
    private ArrayList<CanFly> animalsCanFly;
    private ArrayList<CanSwim> animalsCanSwim;

    public Zoo(String name, String adress) {
        this.name = name;
        this.Adress = adress;
    }

    public void addDog(Dog dog) {
        this.dogs.add(dog);
    }

    public ArrayList<Dog> dogList() {
        return dogs;
    }

    public void printDogs() {
        for (Dog dog : dogs) {
            System.out.println("dog = " + dog);
        }
    }
}

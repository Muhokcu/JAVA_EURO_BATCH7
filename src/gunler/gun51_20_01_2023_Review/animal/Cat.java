package gunler.gun51_20_01_2023_Review.animal;

public class Cat extends Animal {
    public String bread;
    public Cat(String name, int age, String bread){
        super(name,age);
        this.bread=bread;
    }
    public void meow(){
        System.out.println(name + " is meowing");
    }
}

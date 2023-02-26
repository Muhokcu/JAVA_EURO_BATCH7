package gunler.gun60_03_02_2023_Review;

public class D2Muhendis extends D1Person {
    public D2Muhendis(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(this.getAge() + " Bu fabrikada muhendis olarak calisiyorum");

    }

    @Override
    public String showInfo() {
        return this.getName() + " - " + this.getAge() + " yasindayim";
    }
}

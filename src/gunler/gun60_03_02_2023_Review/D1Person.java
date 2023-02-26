package gunler.gun60_03_02_2023_Review;

public abstract class D1Person {
    protected String name;
    protected int age;

    public D1Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void work();

    public abstract String showInfo();
}

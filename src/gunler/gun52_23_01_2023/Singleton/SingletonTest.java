package gunler.gun52_23_01_2023.Singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton.printNumberOfInstance();
        Singleton.getSingleInstance();
        Singleton.printNumberOfInstance();

        Singleton.getSingleInstance();
        Singleton.printNumberOfInstance();

        Singleton.getSingleInstance();
        Singleton.printNumberOfInstance();

        Singleton singleton1 = Singleton.getSingleInstance();
        Singleton.printNumberOfInstance();
        System.out.println("singleton1(hashCode) = " + singleton1.hashCode());

        Singleton singleton2 = Singleton.getSingleInstance();
        Singleton.printNumberOfInstance();
        System.out.println("singleton2(hashCode) = " + singleton2.hashCode());

        if (singleton1 == singleton2) {
            System.out.println("İki instance aynı objeyi referans ediyor.");
        }
    }
}

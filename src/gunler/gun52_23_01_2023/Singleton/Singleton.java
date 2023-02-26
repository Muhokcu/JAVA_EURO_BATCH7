package gunler.gun52_23_01_2023.Singleton;

public class Singleton {
    private static Singleton singleInstance = null;
    private static int numberOfInstance = 0;


    private Singleton() {
        numberOfInstance++;
    }

    public static void printNumberOfInstance() {
        System.out.println("Oluşturulan toplam instance sayısı = " + numberOfInstance);
    }

    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}
package gunler.gun22_22_11_2022;

public class MethodWithLoopkod6 {
    public static void main(String[] args) {
        System.out.println("Main method icerisindeyim");
        for (int i = 1; i <= 5; i++) {
            displayMessage();
            System.out.println("Tekrar Main method icerisindeyim. dongu: " + i);
        }
        System.out.println("son kez main methodu icerisndeyim");
    }

    public static void displayMessage() {
        System.out.println("displayMessage icerisindeyim");
    }
}

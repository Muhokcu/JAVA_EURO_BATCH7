package gunler.gun55_27_01_2023_Review.RestaurantProject;

public class Waiter {

    private String name;
    private boolean isAvailable;

    public Waiter(String name, boolean isAvailable) {
        this.name = name;
        this.isAvailable = isAvailable;


    }

    public void takeOrder(String order) {
        if (isAvailable) {
            System.out.println(name + "waiter is taking order for " + order);
        }else {
            System.out.println(name+ " waiter is not available");
        }

    }
}

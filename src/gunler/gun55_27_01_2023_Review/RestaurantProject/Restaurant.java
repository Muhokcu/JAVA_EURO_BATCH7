package gunler.gun55_27_01_2023_Review.RestaurantProject;

public class Restaurant {
    private Chef chef;
    private Waiter[] waiters;
    private Table[] tables;

    public Restaurant(Chef chef, Waiter[] waiters, Table[] tables) {
        this.chef = chef;
        this.waiters = waiters;
        this.tables = tables;

    }

    public void serve(String order, int tableNumber, int guests) {
        chef.cook();
        for (Waiter waiter : waiters) {
            waiter.takeOrder(order);

        }

    }

}

package gunler.gun55_27_01_2023_Review.RestaurantProject;

public class Table {
    private int number;
    private int seats;

    public Table(int number, int seats) {
        this.number = number;
        this.seats = seats;
    }

    public void reserve(int guests) {
        if (guests <= seats) {
            System.out.println("Table number " + number + " reserved for " + guests + " guests");
        } else {
            System.out.println("Table number " + number + " can only seat " + seats + " guests");
        }
    }
}

package gunler.gun55_27_01_2023_Review.RestaurantProject;

public class Chef {
    private String name;
    private String specialty;

    public Chef(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;

    }

    public void cook() {
        System.out.println(name + " chef is cooking " + specialty);
    }

}

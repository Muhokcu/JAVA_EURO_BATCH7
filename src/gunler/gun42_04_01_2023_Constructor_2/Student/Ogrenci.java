package gunler.gun42_04_01_2023_Constructor_2.Student;
public class Ogrenci {
    int schoolNumber;
    String name;
    String country;
    String city;

    public Ogrenci(int schoolNumber, String name, String country, String city) {
        this.schoolNumber = schoolNumber;
        this.name = name;
        this.country = country;
        this.city = city;
    }

    public String toString(){
        String strF = "%-5d %-10s %-10s %-10s";
        //     String str = schoolNumber + "," + name + "," + city + "," + country;
        return String.format(strF,schoolNumber,name,city,country);
    }
}

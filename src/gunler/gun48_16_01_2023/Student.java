package gunler.gun48_16_01_2023;

public class Student {

    private String name;
    private int SchoolNumber;
    private String division;


    public Student(String name, String division) {
        this.name = name;
        this.division = division;
        // name =stname;
        //division = stdivision


    }
    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        System.out.println("To String methodu calisti");
        return "Student{" +
                "name='" + name + '\'' +
                ", SchoolNumber=" + SchoolNumber +
                ", division='" + division + '\'' +
                '}';
    }
}

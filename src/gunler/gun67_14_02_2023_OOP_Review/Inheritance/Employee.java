package gunler.gun67_14_02_2023_OOP_Review.Inheritance;
public class Employee extends Person {

    public int employeeId;
    public double salary;

    public Employee(String name, String address, int age, int employeeId, double salary) {
        super(name, address, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void printPersonInfo(){
        super.printPersonInfo();
        System.out.println("employeeId = " + employeeId);
        System.out.println("salary = " + salary);
    }

}

package gunler.gun49_17_01_2023.employee;

public class EmployeeTest5 {
    public static void main(String[] args) {


        Employee1 employee1 = new Employee1();
        employee1.name = "Ahmet";
        employee1.employeeID = 12345;

        System.out.println("employee1.name = " + employee1.name);
        System.out.println("employee1.employeeID = " + employee1.employeeID);

        // Child Class (Developer) dan olusturulan object ile
        // Parent Class (Employee) in instancelarina inheritence yardimi ile ulasmis oluyoruz
        Developer2 dev1 = new Developer2();
        dev1.name = "Ayse";
        dev1.employeeID = 12346;
        dev1.projectName = "Chip";

        System.out.println("dev1.name = " + dev1.name);
        System.out.println("dev1.employeeID = " + dev1.employeeID);
        System.out.println("dev1.projectName = " + dev1.projectName);

        Lawyer3 law1 = new Lawyer3();
        law1.name = "Mehmet";
        law1.caseStatus = "Open";

        System.out.println(law1.name);
        System.out.println(law1.caseStatus);

        Secretary4 sec1 = new Secretary4();
        sec1.name = "Fatma";
        sec1.officeName = "Accountant";

        System.out.println(sec1.name);
        System.out.println(sec1.officeName);

        sec1.leaveHoliday();
        sec1.giveReport();


    }
}

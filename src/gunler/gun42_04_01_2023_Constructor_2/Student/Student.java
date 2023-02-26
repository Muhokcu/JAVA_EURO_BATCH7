package gunler.gun42_04_01_2023_Constructor_2.Student;

public class Student {
    int schoolNumber;
    String name;
    String country;
    String city;

    public Student() {
        System.out.println("Default constructor invoked.");
    }

    public Student(int schoolNumber){
        this.schoolNumber = schoolNumber;
        System.out.println("Parameterized-Constructor with 'schoolNumber parameter invoked.");
    }

    public Student(int schoolNumber, String name) {
        this(schoolNumber);//Constructor chaining---> calling a constructor from inside the other constructor
        //this.schoolNumber = schoolNumber;
        this.name = name;
        System.out.println("Parameterized-Constructor with 'schoolNumber' and 'name' parameters invoked.");
    }

    public Student(int schoolNumber, String name, String country) {
        this(schoolNumber,name); //Constructor chaining---> calling a constructor from inside the other constructor
       /* this.schoolNumber = schoolNumber;
        this.name = name;*/
        this.country = country;
        System.out.println("Parameterized-Constructor with 'schoolNumber', 'name' and country parameters invoked.");
    }

    public Student(int schoolNumber, String name, String country, String city) {
        this(schoolNumber,name,country); //Constructor chaining---> calling a constructor from inside the other constructor
        /*this.schoolNumber = schoolNumber;
        this.name = name;
        this.country = country;*/
        this.city = city;
        System.out.println("Parameterized-Constructor with 'schoolNumber', 'name', country and city parameters invoked.");
    }

    public String toString(){
        String str = "";
        str += "Okul no             : " + this.schoolNumber + "\n";
        str += "Öğrencinin adı      : " + this.name + "\n";
        str += "Öğrencinin Ülkesi   : " + this.country + "\n";
        str += "Öğrencinin Şehri    : " + this.city;

        return str;
    }
}

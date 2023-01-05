package gunler.gun42_04_01_2023;

import gunler.gun26_29_11_2022.Student;

public class Student3 {
    int schoolNummer ;
    String name;
    String country;
    String city;


    public Student3(int schoolNummer, String name) {
        this.schoolNummer = schoolNummer;
        this.name = name;
    }

    public Student3(int schoolNummer, String name, String country, String city) {
        this.schoolNummer = schoolNummer;
        this.name = name;
        this.country = country;
        this.city = city;
    }
}

package gunler.gun42_04_01_2023_Constructor_2.Student;

import java.util.ArrayList;

//PLease write the suitable code for  Course Class to create object of class and to add Student to course
public class Course {
    String name;
    int maxCapacity;
    int emptyCapacity;

    ArrayList<Student> studentList = new ArrayList<>();

    public Course(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    public int getEmptyCapacity() {
        emptyCapacity = maxCapacity - studentList.size();
        return emptyCapacity;
    }

    public void studentAdd(Student student) {
        if (getEmptyCapacity() > 0) {
            studentList.add(student);
            System.out.println(student.schoolNumber + " no'lu " + student.name + " kursa eklandi.");
        } else System.out.println("Kurs kapasitesi dolduğundan öğrenci kursa eklenemedi!");

    }
}

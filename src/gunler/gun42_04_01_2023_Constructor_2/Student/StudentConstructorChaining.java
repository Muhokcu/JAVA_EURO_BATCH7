package gunler.gun42_04_01_2023_Constructor_2.Student;

public class StudentConstructorChaining {
    public static void main(String[] args) {
        Student ogrenci1 = new Student(12345);
        System.out.println(ogrenci1);
        System.out.println("------------------------");

        Student ogrenci2 = new Student(5678,"Ahmet Falanca");
        System.out.println(ogrenci2);

        System.out.println("------------------------");

        Student ogrenci3 = new Student(8765,"Hasan Smith","Falanca Ülke");
        System.out.println(ogrenci3);
        System.out.println("------------------------");

        Student ogrenci4 = new Student(9876,"Mery Meryson","Kaf dağı ülkesi","Öylesine bir şehir");
        System.out.println(ogrenci4);
        System.out.println("------------------------");
    }

}

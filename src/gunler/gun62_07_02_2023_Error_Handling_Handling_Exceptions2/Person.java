package gunler.gun62_07_02_2023_Error_Handling_Handling_Exceptions2;

public class Person {
    private String name;
    private int age;
    private String address;


    public Person(String name, int age, String address) throws AgeException, NameException {
        this.name = setName(name);
        this.age = setAge(age);
        this.address = setAddress(address);

    }

    public String getName() {
        return name;
    }

    public String setName(String name) throws NameException {
        if (name.isBlank() || name.length() < 3) {
            throw new NameException("Isim Alani bos veya 3 karakterden bos olamaz");
        }
        return this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) throws AgeException {
        if (age > 0 && age <= 150) {
            return this.age = age;
        } else throw new AgeException("Yas bilgisi 0 - 150 arasinda bir deger olmalidir!");
    }

    public String getAddress() {
        return address;
    }

    public String setAddress(String address) throws AddressException {
        if (address.isBlank()) {
            throw new AddressException("Adres bilgisi bos olamaz");
        }
        return this.address = address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

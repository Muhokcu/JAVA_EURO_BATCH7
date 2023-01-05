package gunler.gun24_25_11_2022;

public class Method {
    public static void printRonaldo() {
        System.out.println("Ronaldo");
    }

    public static void printMessi() {
        System.out.println("Messi");
    }

    public static void printName(String name) {
        System.out.println("name = " + name);
    }

    public static void printAgeAndName(String name, int age) {
        System.out.println(name + " " + age + " yasindadir.");
    }


    public static void main(String[] args) {
        String isim;
        System.out.println("main metod icindeyiz");
        printRonaldo();
        System.out.println("hala main metod");
        isim = "Ronaldo";
        isim = "Pele";

        System.out.println("isim = " + isim);
        printName("Ali");
        printName(isim);
        printAgeAndName("Veli", 30);
        printAgeAndName(isim, 70);
        printAgeAndName("Ali", 40);


    }
}

package gunler.gun48_16_01_2023;

public class Review {
    public String name;// insatance variable
    public static int number;// Class member

    static {
        System.out.println("Inside the static block");

    }

    {
        System.out.println("Inside the non-static block");
    }

    public void nonStaticMethod() { // instance method
        System.out.println("name = " + name);
        System.out.println("Non static Method");
        this.name = "Deneme"; // this i burda kullanabiliyoruz cunku burasi non static bir yapi
    }

    public static void print() {
        Review rw = new Review();
        System.out.println("rw.name = " + rw.name);
        rw.nonStaticMethod();
        System.out.println("Printing some info..");
        // System.out.println(name);//can not compile ... static method can not reach non static members of a class
        // nonStaticMethod();// non static method can not be rached in static methos
        //this.name= "deneme"; // this keyword can not be used in static context

    }


    public static void main(String[] args) {

        System.out.println("RevieW Static members and Encapsulation in Java.");
        //nonStaticMethod();// non static method can not be rached in static methos
        // System.out.println(name);//can not compile ... static method can not reach non static members of a class
        Review rw1 = new Review();
        System.out.println("rw1.name = " + rw1.name);
        rw1.nonStaticMethod();

        print();//static member can be reached directly from other static context
    }
}

package gunler.gun53_24_01_2023.GarbageCollection;

public class GarbageClass {

    String name;
    int age;
    static int count;

    public GarbageClass() {
    }

    public GarbageClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void finalize(){
        count++;
        System.out.println(count);
        System.out.println("Garbage collection çalıştı.");
    }
}

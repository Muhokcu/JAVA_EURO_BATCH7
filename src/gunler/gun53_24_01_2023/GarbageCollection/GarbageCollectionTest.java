package gunler.gun53_24_01_2023.GarbageCollection;

public class GarbageCollectionTest {

    public static void main(String[] args) {
        GarbageClass obje1 = new GarbageClass();
        GarbageClass obje2 = new GarbageClass();
        GarbageClass obje3 = new GarbageClass();
        GarbageClass obje4 = new GarbageClass();

        obje1 = null; //instance is eligible for garbage collection
        obje3 = obje4; //instance is eligible for garbage collection

        for (int i = 0; i < 100_000; i++) {
            GarbageClass obje;
            obje = new GarbageClass(); //instance is eligible for garbage collection
        }
        System.gc(); //Force to start garbage collection. Otherwise JVM decides whether run the garbage collection start or not
    }
}

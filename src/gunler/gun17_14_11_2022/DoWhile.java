package gunler.gun17_14_11_2022;

public class DoWhile {
    public static void main(String[] args) {
        // degisken olusturulacak ve baslangic degeri atanacak
        // condition = sart
        // degisken degeri degisecek
        int a = 20;
        int i =0;
        do {

            System.out.println("Blok ici 1");
            System.out.println("hello");
            System.out.println("Blok ici 2");
            ++a;
        } while (a < 10);
        System.out.println("blok disi");

    }
}

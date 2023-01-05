package gunler.gun18_15_11_2022;

public class ForLoop2 {
    public static void main(String[] args) {
        //Dongu degiskenini statemente kullanmak ve dongu sayisini statemente bastirma
        for (int i = 1; i <= 5; i++) {
            System.out.println("Kacinci dongu : " + i);
            System.out.println("Hello World");
        }
        System.out.println("------------------------");
        //donguyu baslangic noktasi degiskeni olabilir
        //int i = 10; // integeri disarda atayip icerisine i oalrak yazilabilir
        for (int i = 50; i <= 60; i++) {
            System.out.println(i);
        }
        System.out.println("------------------------");
        // inc/ dec i kontrol
        for (int i = 0; i < 10; i = i + 3) {
            System.out.println(i);

        }
        System.out.println("-------------------------");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

}

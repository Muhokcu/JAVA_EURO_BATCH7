package gunler.gun29_05_12_2022;

public class KisiTest {
    public static void main(String[] args) {
        Kisil ali=new Kisil();
        ali.yasHesapla(1990);
        Kisil veli=new Kisil();
        veli.yasHesapla(1970);
        System.out.println("ali.kisiYas = " + ali.kisiYas);
        System.out.println("veli.kisiYas = " + veli.kisiYas);
    }
}

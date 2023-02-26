package gunler.gun56_30_01_2023_Abstraction.Sekiller;

public class Main {
    public static void main(String[] args) {


        // An abstract class can not be instantiated
        // We can not create an object from an abstract class
        // Sekil sekil = new Sekil();

        Kare kare = new Kare();
        kare.cizme(); // abstract classtaki instance method a ulasabiliyorum

        Sekil.kaydir();
    }


}

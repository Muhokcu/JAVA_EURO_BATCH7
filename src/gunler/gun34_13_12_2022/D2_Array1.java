package gunler.gun34_13_12_2022;

public class D2_Array1 {
    public static void main(String[] args) {
        double[] yuzdeler;
        yuzdeler = new double[4];

        yuzdeler[0] = 20.5;
        yuzdeler[1] = 75.3;
        yuzdeler[2] = 15.8;
        yuzdeler[3] = 32.3;
        System.out.println("yuzdeler[0] = " + yuzdeler[0]);
        System.out.println("yuzdeler[1] = " + yuzdeler[1]);
        System.out.println("yuzdeler[2] = " + yuzdeler[2]);
        System.out.println("yuzdeler[3] = " + yuzdeler[3]);



        // yuzdeler[4]=35.5;  boyle sinirlarin disinda bir veri almaya calisirsak hata verir hata = (ArrayIndexOutOfBoundsException)
        // System.out.println("yuzdeler[4] = " + yuzdeler[4]);


    }
}

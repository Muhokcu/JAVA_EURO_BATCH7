package gunler.gun15_09_11_2022;

public class TriangleCheck {
    public static void main(String[] args) {

        // Write a program that prints type of the triangle according to its angles
        // Ic acilari verilmis bir ucgenin turunu ternary ile tespit eden bit program yaziniz
        // Eskenar ucgen, Ikizkenar ucgen, Cesitkenar ucgen

        int aci1 = 50;
        int aci2 = 40;
        int aci3 = 90;
        String ucgenTuru;

        if (aci1 == aci2 && aci2 == aci3) {
            ucgenTuru = "Eskenar Ucgen";
        } else if (aci1 == aci2 || aci1 == aci3 || aci2 == aci3) {
            ucgenTuru = "Ikizkenar Ucgen";
        } else {
            ucgenTuru = "Cesitkenar Ucgen";
        }

        System.out.println("ucgenTuru = " + ucgenTuru);

        ucgenTuru = (aci1 == aci2 && aci2 == aci3) ? "Eskenar Ucgen" : (aci1 == aci2 || aci1 == aci3 || aci2 == aci3) ? "Ikizkenar Ucgen" : "Cesitkenar Ucgen";

        System.out.println("ucgenTuru = " + ucgenTuru);

    }
}



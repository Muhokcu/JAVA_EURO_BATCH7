package gunler.gun53_24_01_2023;

public class D11VariableHidingChild extends D10VariableHidingParent {
    public String name = "Child isim"; //Parent class name variable is hided

    public static void main(String[] args) {
        D10VariableHidingParent vrbParent = new D10VariableHidingParent();
        D11VariableHidingChild vrbChild = new D11VariableHidingChild();

        System.out.println("vrbChild.name = " + vrbChild.name);
        System.out.println("vrbChild.number = " + vrbChild.number);

        System.out.println("vrbParent.name = " + vrbParent.name);

    }
}

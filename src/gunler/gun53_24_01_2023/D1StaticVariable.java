package gunler.gun53_24_01_2023;

public class D1StaticVariable {
    static String okulAdi;// Static/ Class variable
    public String adres;// Instance/ Object variable

    D1StaticVariable() {
        // static String abc; // Burda boyle tanimlama yapilamamaktadir // Constructor icerinsinde static tanimlama yapilamaz
        okulAdi = "EuroTech Study";
    }

    public void method() {
        // static int number;  // Burda boyle tanimlama yapilamamaktadir // Constructor icerinsinde static tanimlama yapilamaz
        okulAdi = "Tester Academy";
    }

    public static void main(String[] args) {
        System.out.println("StaticVariable.okulAdi = " + D1StaticVariable.okulAdi);
        D1StaticVariable stcVar = new D1StaticVariable();
        D1StaticVariable stcVar1 = new D1StaticVariable();
        System.out.println("StaticVariable.okulAdi = " + D1StaticVariable.okulAdi);
        stcVar.method();
        System.out.println("StaticVariable.okulAdi = " + D1StaticVariable.okulAdi);
        stcVar.adres = "Herhangi bir adres";
        stcVar1.adres = "An other address";
        stcVar.okulAdi = "Bir okul";
        stcVar1.okulAdi = "An other school";
        System.out.println("stcVar.okulAdi = " + stcVar.okulAdi);
        System.out.println("stcVar1.okulAdi = " + stcVar1.okulAdi);
        System.out.println("stcVar.adres = " + stcVar.adres);
        System.out.println("stcVar1.adres = " + stcVar1.adres);


    }
}

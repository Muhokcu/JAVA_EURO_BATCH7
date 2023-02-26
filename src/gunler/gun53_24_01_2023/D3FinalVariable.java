package gunler.gun53_24_01_2023;


public class D3FinalVariable {
    //Declaration and assignment
    // -- Same statement
    //--constructors
    // -- init block
    //final olarak tanimlanan degiskenler ayni zamanda CONSTANT yani sabit olarakta tanimlanirlar'
    final int number = 10;// deger atanmasi gereklidir aksi takdirde hata verir// Declaration and assigmengt in same statement
    final int number1;//
    final int number2;

    // bunlar ornekler FINAL KULLANIRKEN BUYUK YAZILIR
    //best practice olarak buyuk harfle yazilirlar
    final int OKUL_NO = 1234;
    final double PI = 3.14;// final ile tanimlananlar kural olrak byuk harfle yazilir ki basklari final olarak tanimlandigini anlasin
    final double KDV_18 = 0.18;// final ile tanimlananlar kural olrak byuk harfle yazilir ve cames case e pek uyulma devam eden kelime alt cizgi ile ayrilr ki basklari final olarak tanimlandigini anlasin
    final double KDV_1 = 0.1;
    final double TUKETICI_KREDI_FAIZI = 0.89;
    final double KONUT_KREDI_FAIZI = 1.39;

    // eger burda atama yapmassak 2 yerde atama yapabiliriz
    // 1 constructor blogunun icinde atama yapilabilir / D3FinalVariable(){ burasi constructor
    // 2 Initilazition block icinde atama yapilabilir
    //  final int number4;// method icerisinde atma yapamayiz
    D3FinalVariable() {
        System.out.println("Constructor block called");

        number1 = 25;//Assignment
    }

    // Initilazition block
    {
        System.out.println("Init block called");
        number2 = 35;//Assignment in initi block
    }

    void method() {
        // number4=64;//

    }

    public static void main(String[] args) {
        D3FinalVariable fnlVar = new D3FinalVariable();
        System.out.println("fnlVar.number = " + fnlVar.number);
        System.out.println("fnlVar.number1 = " + fnlVar.number1);
        System.out.println("fnlVar.number2 = " + fnlVar.number2);

        //fnlVar.number= 25; // Final tanimlamasi icin yeni deger atamasi yapilamaz

        System.out.println("fnlVar.KDV_18 = " + fnlVar.KDV_18);
        System.out.println("fnlVar.OKUL_NO = " + fnlVar.OKUL_NO);
        System.out.println("fnlVar.PI = " + fnlVar.PI);
        System.out.println("fnlVar.TUKETICI_KREDI_FAIZI = " + fnlVar.TUKETICI_KREDI_FAIZI);
        System.out.println("fnlVar.KONUT_KREDI_FAIZI = " + fnlVar.KONUT_KREDI_FAIZI);


    }

}

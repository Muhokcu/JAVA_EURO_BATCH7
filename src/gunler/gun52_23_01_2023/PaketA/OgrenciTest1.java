package gunler.gun52_23_01_2023.PaketA;

import gunler.gun52_23_01_2023.Constructor.Ogrenci;

public class OgrenciTest1 extends Ogrenci {

    OgrenciTest1() {// Protected tanimlandigi icin miras iliskisi kurulduktan sonra instance olusturulabilir
        super("Ahmet", "Veli", 123);
    }

    public static void main(String[] args) {
        OgrenciTest1 ogrenciTest = new OgrenciTest1();
        System.out.println("ogrenciTest.getAd() = " + ogrenciTest.getAd());
    }
}


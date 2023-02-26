package gunler.gun53_24_01_2023;

public class D6FinalMethodParent {
    final double KDV_ORANI = 0.18;

    //Declared as final therefore child classes can not override this method
    public final double kdvliFiyatHesapla(double fiyat) {
        return (KDV_ORANI * fiyat) + fiyat;
    }

}

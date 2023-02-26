package gunler.gun53_24_01_2023;

public class D7FinalMethodChild extends D6FinalMethodParent {

    //Declared as final in Parent Class therefore child classes can not override this method
  /*  @Override
   public double kdvliFiyatHesapla(double fiyat){
      return (fiyat * 0.10) + fiyat;
   }*/

    public static void main(String[] args) {
        D7FinalMethodChild ornekChid = new D7FinalMethodChild();

        System.out.println("ornekChid.KDV_ORANI = " + ornekChid.KDV_ORANI);
        System.out.println("ornekChid.kdvliFiyatHesapla(100) = " + ornekChid.kdvliFiyatHesapla(100));
    }
}

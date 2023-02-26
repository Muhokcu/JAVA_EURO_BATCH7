package gunler.gun03_19_10_2022;

public class Commentout {

    public static void main(String[] args) {

        //Kendinden sonraki kodu aciklamak icin firsat verir
        //Kod okunurken hata almamizi engeller
        System.out.println("Tek satir aciklama");

        /*
        Birden fazla satir icin
        eger aciklama yazmamiz gerekiyorsa
        yildiz slash ile comment out yapabiliriz
         */
        System.out.println("Coklu satir aciklama");

        /*
        yada okunmasini istemedigimiiz bir kodu
        halen muhafaza ermek istedigimizde

        public static Console console() {
         Console c;
         if ((c = cons) == null) {
             synchronized (System.class) {
                 if ((c = cons) == null) {
                     cons = c = SharedSecrets.getJavaIOAccess().console();
                 }
             }
         }
         return c;
     }
         */


}
}

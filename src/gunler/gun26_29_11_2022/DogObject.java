package gunler.gun26_29_11_2022;

public class DogObject {
    public static void main(String[] args) {
        //ClassName    // objectNAme        //new keyword      // ClassName/Constructor
            Dog             dog       =         new                    Dog();

        Dog dog2 = new Dog();

        Dog dog3 = new Dog();

        // "." nokta(dot) operatorunu kullanarak template class taki field ve method ulasabiliyoruz
        dog.ad = "Artis";
        dog.cins = "Dalmacyali";
        dog.renk = "SiyahBeyaz";
        dog.yas = 6;
        System.out.println("dog.ad = " + dog.ad);
        System.out.println("dog.cins = " + dog.cins);
        System.out.println("dog.renk = " + dog.renk);
        System.out.println("dog.yas = " + dog.yas);
        dog.havla();
        dog.isir();
        dog.yemekYe();
        dog.uyu();

        // object uzerinden ulasilan field a yeni deger assign etmek mumkun
        dog.cins="Doberman";
        System.out.println("dog.cins = " + dog.cins);

        // ayni methodu projede ihtiyac oldukca tekrardan cagirmak kullanmak mumkun
        dog.havla();
        dog.havla();
        dog.havla();
        //Ayni classdan olusturulmus farkli objectler taki fieldda farkli degerler tasiyabilir.
        dog2.ad="Max";
        System.out.println("dog.ad = " + dog.ad);
        System.out.println("dog2.ad = " + dog2.ad);


        // Default degerler
        //String default
        System.out.println("dog3.ad = " + dog3.ad);// herhangi bir deger atanmadigi icin null donduruyor

        //int deger
        System.out.println("dog3.ad = " + dog3.yas);// herhangi bir deger atanmadigi icin 0 donduruyor

        // boolen default
        System.out.println("dog3.evcil = " + dog3.evcil);


        //char default value
        System.out.println("dog3.cinsiyet = " + dog3.cinsiyet);






    }
}

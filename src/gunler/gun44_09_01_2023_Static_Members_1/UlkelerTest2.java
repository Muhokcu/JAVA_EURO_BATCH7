package gunler.gun44_09_01_2023_Static_Members_1;

public class UlkelerTest2 {
    public static void main(String[] args) {
        System.out.println("Ulkeler1.ulkelerSayac = " + Ulkeler1.ulkelerSayac);

        Ulkeler1 ulke1=new Ulkeler1("Turkiye","TR",90);
        System.out.println("Ulkeler1.ulkelerSayac = " + Ulkeler1.ulkelerSayac);

        Ulkeler1 ulke2=new Ulkeler1("Almanya","D",49);
        Ulkeler1 ulke3=new Ulkeler1("Amerika B.Dev","USA",1);
        System.out.println("Ulkeler1.ulkelerSayac = " + Ulkeler1.ulkelerSayac);


        System.out.println(ulke1);
        System.out.println(ulke2);
        System.out.println(ulke3);

        Ulkeler1 ulke4 = new Ulkeler1("Ingiltere", "GB", 44);
        System.out.println("Ulkeler1.ulkelerSayac = " + Ulkeler1.ulkelerSayac);
        System.out.println("ulke1.ulkelerSayac = " + ulke1.ulkelerSayac);
        System.out.println("ulke3.ulkelerSayac = " + ulke3.ulkelerSayac);


        System.out.println("ulke1.name = " + ulke1.name);
        System.out.println("ulke2.name = " + ulke2.name);
        ulke4.ulkelerSayac=345;
        System.out.println("ulke4.ulkelerSayac = " + ulke4.ulkelerSayac);

        System.out.println("ulke1.ulkelerSayac = " + ulke1.ulkelerSayac);
        System.out.println("ulke2.ulkelerSayac = " + ulke2.ulkelerSayac);

        System.out.println("Ulkeler1.ulkelerSayac = " + Ulkeler1.ulkelerSayac);
        ulke4.dummyCounter=23;
        System.out.println("ulke4.dummyCounter = " + ulke4.dummyCounter);


    }
}

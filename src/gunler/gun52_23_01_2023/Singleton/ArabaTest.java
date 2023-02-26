package gunler.gun52_23_01_2023.Singleton;

public class ArabaTest {


    public static void main(String[] args) {

        //  Araba honda = new Araba(); //Constructor private access modifier ile belirlendiğinden bu yolla instance oluşturulamaz.
        Araba.maxInstance = 2;//Araba Class ından oluşturabilecek Maxsimum instance sayısı
        Araba araba1 = Araba.instanceOlustur();
        araba1.marka = "Honda";
        araba1.model = "Civic";
        System.out.println("araba1 = " + araba1);

        Araba araba2 = Araba.instanceOlustur();
        Araba araba3 = Araba.instanceOlustur();

        System.out.println("araba1.hashCode() = " + araba1.hashCode());
        System.out.println("araba2.hashCode() = " + araba2.hashCode());


        System.out.println("araba2 = " + araba2);
        System.out.println("araba3 = " + araba3);
    }

}

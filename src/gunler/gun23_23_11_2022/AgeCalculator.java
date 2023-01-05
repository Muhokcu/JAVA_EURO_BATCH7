package gunler.gun23_23_11_2022;

public class AgeCalculator {
    public static void main(String[] args) {
        // parametre olarak isim su anki tarih ve dogum tarihini paremetre oalrak alip kisinin yasini hesaplayan bir method yaziniz

        ageCalculator("Ahmet", 2022, 1990);
     //   ageCalculator("Ayse", 2022, 1997);
    }

    public static void ageCalculator(String name, int tarih, int dogumTarihi) {
        int age;
        age = tarih - dogumTarihi;
        System.out.println(name + " isimli kisi " + age + " yasindadir");

    }
}

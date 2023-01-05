package gunler.gun27_30_11_2022;

public class Ogrenci {
    int numara;
    int yas;
    String isim;

    public static void main(String[] args) {
        Ogrenci ali = new Ogrenci();
        Ogrenci fatma;
        ali.yas = 15;
        ali.numara = 556;
        fatma = new Ogrenci();
      //  fatma numara = 600;
        //fatma yas = 16;
        System.out.println("fatma = " + fatma.yas);
        System.out.println(ali.yas);
        Ogrenci ronaldo = ali;
        System.out.println("ronaldo.yas = " + ronaldo.yas);

    }

}

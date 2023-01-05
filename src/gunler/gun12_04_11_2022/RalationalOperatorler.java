package gunler.gun12_04_11_2022;

public class RalationalOperatorler {
    public static void main(String[] args) {
        // >   <   <=   >=  ==  !=  / boolen deger uretir
        int a = 10;
        int b = 20;
        System.out.println(a > b);
        boolean sonuc = a > b;
        // System.out.println("a > b = " + a > b);
        // "a > b = " + a > b  string ile int bir araya gelmez
        System.out.println("sonuc = " + sonuc);
        int numara = 21;
        boolean ciftSayi = numara % 2 != 0;
        System.out.println("ciftSayi = " + ciftSayi);
        if(ciftSayi == false) {
            System.out.println("numara tek sayidir");
        }
        numara = 0;
        boolean numarapozitifSayimi = numara >=0;
        System.out.println(numarapozitifSayimi);
    }
}

package gunler.gun52_23_01_2023.PaketB;

public class AccessModifiers {

    private int id;
    protected long TCNo;
    public String name;
    int okulNo;// burdaki default

    private void privateToplama(int sayiA, int sayiB) {
        System.out.println("I am private method");
        System.out.println("Toplam = " + (sayiA + sayiB));
    }

    void defaultMethod() {
        System.out.println("I am a default method");


    }

    protected void protectedMethod() {
        System.out.println("I am a protected method");


    }

    public void publicMethod() {
        System.out.println("I am a public method");

    }

    public static void main(String[] args) {
        System.out.println("Access modifiers in java");

        //defaultMethod(); kendi clasinin icerisinde bile olsa static olmayan yapilara dogrudan erisilemez
        // ulasmak istnirse statik olmayan methodtan instence olusturmak gerekli
        AccessModifiers accessModifiers = new AccessModifiers();// ornegin boyle

        accessModifiers.id = 10;// Private tanimlanmasina ragmen ayni class icerisinde erisebiliriz
        accessModifiers.name = "EuroStudy";//public tanimlandigindan en genis gorunurluge sahip ve her class tan erisebiliriz
        accessModifiers.okulNo = 1234;// default tanimlanmasi ile ayni class ve paket icerisinde erisebiliriz
        accessModifiers.TCNo = 12345678911L;//Protected tanımlanması ile belirlendiği için aynı class, aynı paket veya farklı paket
                                            // miras ilişkisi olan başka bir class içerisinden erişibiliriz.

        // Ayni class icerisinden cagirdigimizdan butun methodlara herhangi bir access modofier kisitlamasi olmaksizin erisebiliriz
        accessModifiers.privateToplama(23, 2);
        accessModifiers.defaultMethod();
        accessModifiers.protectedMethod();
        accessModifiers.publicMethod();

    }
}

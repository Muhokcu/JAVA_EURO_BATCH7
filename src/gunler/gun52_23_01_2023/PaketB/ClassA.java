package gunler.gun52_23_01_2023.PaketB;

public class ClassA {
    public static void main(String[] args) {

        AccessModifiers accessModifiers = new AccessModifiers();
        //Private
        // accessModifiers.privateToplama(12,45); // Aynı paket içerisinde olsak bile private tanımlanmış bir üyeye erişemeyiz.
        // accessModifiers.id = 10; // Aynı paket içerisinde olsak bile private tanımlanmış bir üyeye erişemeyiz.

        //Default
        accessModifiers.defaultMethod(); //Aynı paket içerisinde olduğumuzdan default tanımlı bir üyeye erişebiliriz.
        accessModifiers.okulNo = 34567; //Aynı paket içerisinde olduğumuzdan default tanımlı bir üyeye erişebiliriz.

        //Protected
        accessModifiers.protectedMethod(); //Aynı paket içerisinde olduğumuzdan protected tanımlı bir üyeye erişebiliriz.
        accessModifiers.TCNo = 1212134234L; //Aynı paket içerisinde olduğumuzdan protected tanımlı bir üyeye erişebiliriz.

        //Public
        accessModifiers.publicMethod(); //Public tanımlı üyelere farklı paketlerde de olsalar bütün class lar erişebilir.
        accessModifiers.name = "Public Name"; //Public tanımlı üyelere farklı paketlerde de olsalar bütün class lar erişebilir.

    }


}

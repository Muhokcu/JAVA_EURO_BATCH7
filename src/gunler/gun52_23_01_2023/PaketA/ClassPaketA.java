package gunler.gun52_23_01_2023.PaketA;

import gunler.gun52_23_01_2023.PaketB.AccessModifiers;


public class ClassPaketA extends AccessModifiers {
    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();

        //public
        accessModifiers.name = "Başka bir paketten erişim"; //Public olduğundan başka bir paketteki class tan da erişebildik
        accessModifiers.publicMethod(); //Public olduğundan başka bir paketteki class tan da erişebildik

        //Protected
        // accessModifiers.protectedMethod(); //Protected tanımlandığından başka bir paket içerisindeki class tan doğrudan erişim yapamayız.
        //accessModifiers.TCNo = 123345; //Protected tanımlandığından başka bir paket içerisindeki class tan doğrudan erişim yapamayız.

        //Default
        //accessModifiers.defaultMethod(); //Default tanımlandığından başka bir paket içerisindeki class tan hiçbir şekilde erişim yapamayız.
        //accessModifiers.okulNo = 34567; //Default tanımlandığından başka bir paket içerisindeki class tan hiçbir şekilde erişim yapamayız.

        //Private
        // accessModifiers.privateToplama(12,45); //Private tanımlandığından başka bir paket içerisindeki class tan hiçbir şekilde erişim yapamayız.
        // accessModifiers.id = 10; //Private tanımlandığından başka bir paket içerisindeki class tan hiçbir şekilde erişim yapamayız.

        //Protected ---child-parent
        ClassPaketA classPaketA = new ClassPaketA(); //ClassPaketA--> child  AccessModifiers --> parent

        classPaketA.TCNo = 12233444L; //Başka paketlerde de olsalar aralarında parent-child ilişkisi olan class lar protected üyelere erişebişirler.
        classPaketA.protectedMethod();//Child class tan parent class ındaki protected üyelerine erişim yapabiliriz.

        //Public ---child-parent
        classPaketA.publicMethod();
        classPaketA.name = "Public member";


    }
}

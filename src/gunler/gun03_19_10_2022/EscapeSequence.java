package gunler.gun03_19_10_2022;

public class EscapeSequence {

    public static void main(String[] args) {

        //\t bir tab ileri gider
        System.out.println("Ahmet\tYilmaz");

        //\n bir satir asagi kayar
        System.out.println("Merhaba\nNasilsin?\nIyiyim\nSen nasilsin?");

        // \" " isareti bastirmaya yarar
        System.out.println("Sampiyon \"Besiktas\"");

        // \' ' isareti bastirmaya yarar
        System.out.println("Ali\'nin arabasi");

        // \ ters slash bastirmaya yarar
        System.out.println("Sen\\Ben\\O\\Biz\\Onlar\\\\\\\\\\");

        // \b onceki karakteri siler
        System.out.println("Onceki karakteri\b siler");

        // \r onceki metnin tumunu siler
        System.out.println("Onceki metni\r siler");

    }


}

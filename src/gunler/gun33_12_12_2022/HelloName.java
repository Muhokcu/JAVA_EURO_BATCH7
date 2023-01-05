package gunler.gun33_12_12_2022;

public class HelloName {
    public static void main(String[] args) {
        String name = "Bob";
        String slm = "Merhaba";
        // Merhaba Bob
        // slm     name
        //  slm+name
        System.out.println(slm + name);
        System.out.println(slm.concat(name));
        System.out.println("slm = " + slm);

        merhaba("Ali");
        merhaba("Veli");
        merhaba("Ayse");

    }

    public static void merhaba(String isim) {

        System.out.println("Merhaba " + isim+"!");
        System.out.println("Merhaba".concat(isim));

    }
}

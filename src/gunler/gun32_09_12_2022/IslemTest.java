package gunler.gun32_09_12_2022;

public class IslemTest {
    public static void main(String[] args) {
        Islem referans = new Islem();
        referans.buyukSayiBulalim(50, 80);
        referans.buyukSayiBulalim(150, 60);
        referans.buyukSayiBulalim(200, 300);

        int kucukSayi = referans.kucukSayiyiBulalim(50, 10);
        System.out.println("kucukSayi = " + kucukSayi);
        System.out.println("metoddan" + referans.sayiGonder());
        int metoddanGelenSayi = referans.sayiGonder();
        System.out.println("100 = " + 100);
        int yuz = 100;
        System.out.println("metoddanGelenSayi = " + metoddanGelenSayi);


    }
}

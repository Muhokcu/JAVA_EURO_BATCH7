package gunler.gun23_23_11_2022;

public class FaktoriyelMethod {
    public static void main(String[] args) {
        // Bir sayinin faktoriyel degerini dinamik olarak hesap eden bir method yaziniz

        int sayi = 10;
        faktoriyelSayiyiBul(sayi);

        faktoriyelSayiyiBul(5);
    }

    public static void faktoriyelSayiyiBul(int number) {
        int faktoriyelDeger = 1;

        for (int i = number; i >= 1; i--) {
            faktoriyelDeger *= i;
        }

        System.out.println(number + " 'in faktoriyel degeri : " + faktoriyelDeger);

    }
}

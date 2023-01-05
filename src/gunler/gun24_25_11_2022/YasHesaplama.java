package gunler.gun24_25_11_2022;

public class YasHesaplama {
    public static void main(String[] args) {
        int cocugunDogumYili = 2000;
        int anneninDogumYili = 1975;
        int anneYas = yasHesaplama(anneninDogumYili);
        int cocukYas = yasHesaplama(cocugunDogumYili);
        System.out.println("anneYas-cocukYas = " + (anneYas - cocukYas));
        int anneCocukYasFarki = yasFarkiHesaplama(anneninDogumYili, cocugunDogumYili);
        System.out.println("anneCocukYasFarki = " + anneCocukYasFarki);
        int babaDogumYili = 1972;
        int babaCocukYasFarki = yasFarkiHesaplama(babaDogumYili, cocugunDogumYili);
        System.out.println("babaCocukYasFarki = " + babaCocukYasFarki);
    }

    public static int yasHesaplama(int dogumYili) {
        int yas = 2022 - dogumYili;
        //        2022 - 1960
        System.out.println("Yasiniz = " + yas);
        return yas;
    }

    public static int yasFarkiHesaplama(int dogumYili, int dogumYili2) {
        int yas1 = yasHesaplama(dogumYili);
        int yas2 = yasHesaplama(dogumYili2);
        int fark = yas1 - yas2;
        System.out.println("fark = " + fark);
        return fark;
    }
}

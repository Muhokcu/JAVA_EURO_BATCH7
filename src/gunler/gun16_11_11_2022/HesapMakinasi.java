package gunler.gun16_11_11_2022;

public class HesapMakinasi {
    public static void main(String[] args) {

        // 2 sabit deger uzerinde switch ase kullanarak farkli aritmetik islemler yapan bir hesap makinasi olusturun
        int num1 = 20;
        int num2 = 18;
        int sonuc = 0;
        String islemTuru;
        char islem = '/';
        switch (islem) {
            case '+':
                islemTuru = "toplama islemi";
                sonuc = num1 + num2;
                break;
            case '-':
                islemTuru = "cikarma islem ";
                sonuc = num1 - num2;
                break;
            case '*':
                islemTuru = "carpma islemi";
                sonuc = num1 * num2;
                break;
            case '/':
                islemTuru = "bolme islemi";
                sonuc = num1 / num2;
                break;
            default:
                islemTuru = "Tanimlanmayan islem";
        }
        System.out.println("islem turu = " + sonuc);


    }
}
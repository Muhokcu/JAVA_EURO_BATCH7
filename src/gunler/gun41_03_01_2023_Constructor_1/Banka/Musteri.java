package gunler.gun41_03_01_2023_Constructor_1.Banka;

public class Musteri {
    // Date members  === veri saklayan degiskenler
    String adi;
    int hesapNo;
    int kimlikNo;
    int telefonNo;
    double bakiye;

    public Musteri(String adi, int hesapNo, int kimlikNo, int telefonNo, double bakiye) {
        this.adi = adi;
        this.hesapNo = hesapNo;
        this.kimlikNo = kimlikNo;
        this.telefonNo = telefonNo;
        this.bakiye = bakiye;
    }

    public Musteri() {

    }

    public void showInfo() {
        System.out.println("****** Musteri Bilgileri******");
        System.out.println("-------------------------------");
        System.out.println("Musterinin adi                :" + this.adi);
        System.out.println("Musterinin kimlik no          :" + this.kimlikNo);
        System.out.println("Musterinin telefon no         :" + this.telefonNo);
        System.out.println("Musterini bakiyesi " + this.bakiye);


    }
}

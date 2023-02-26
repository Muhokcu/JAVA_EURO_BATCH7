package gunler.gun52_23_01_2023.Singleton;


public class Araba {
    static Araba instance; //Metod ile oluşturulan instance ı tutan değişken
    static int instanceSayisi; // Oluşturulan instance sayısı
    static int maxInstance; //Oluşturulabilecek maksimum instance sayısı
    String marka;
    String model;

    //Private constructor
    private Araba() {
        instanceSayisi++; //Oluşturulan instance sayısı
    }

    //Private constructor
    private Araba(String marka, String model) {
        instanceSayisi++; //Oluşturulan instance sayısı
        this.marka = marka;
        this.model = model;
    }
    //Constructor lar private tanımlandığından ancak bu metod ile instance oluşturulabilir.
    public static Araba instanceOlustur(){
        if(instanceSayisi < maxInstance){
            instance = new Araba();
        } else instance = null;
        return instance; //Oluşturulan instance i döndürür.
    }

    @Override
    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';

    }
}

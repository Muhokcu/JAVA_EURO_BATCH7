package gunler.gun23_23_11_2022;

public class passingArgument {
    public static void main(String[] args) {
        // dogrudan argument gonderme
        displayValue(67);
        // degiskeni argument olarak gonderme / daha dinamik
        int number = 10;
        displayValue(number);
        // degiskeni aritmetic islemin sonucu olarak da gonderebiliriz
        displayValue(10 * 5);
        // error
        // argument olarak sadece beklenen deger gonderilebilir
        // yeni bir degisken olusturma veya deklare etme mumkun degil
        // displayValue(int number);
        // displayValue(int number = 10);
        int sayi = 20;
        displayValue(sayi);
    }

    public static void displayValue(int number) {
        System.out.println("Value is : " + number);
    }
}

package gunler.gun17_14_11_2022;

public class WhileLoops {
    public static void main(String[] args) {
        int a = 0;
        while (a < 4) {
            //    System.out.println("Hello");
            a++;
        }
        // dongulerin ortak noktasi
        // 1 degerini degistirebilecegimiz bir degisken olacak genelde int bu degiskene bir baslangic deger iatanaca
        // 2 condition olcak (true- false) treu ise block execute edilecek
        //3 dongumuzu ne kdar calismasini istizorsak  ona goew bir limit belirtmemiz gerek ona gorede degiskenin degerini degistirmemiz gerek artirmak veya aazaltmak
        System.out.println("a = " + a);
        a = 0;
        while (a < 3) {
            System.out.println(a);
            a++;
        }
        System.out.println("Dongu bitti");
    }
}

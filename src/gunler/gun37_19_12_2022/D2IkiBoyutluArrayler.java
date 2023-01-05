package gunler.gun37_19_12_2022;
import java.util.Arrays;
public class D2IkiBoyutluArrayler {
    public static void main(String[] args) {
        String[] birinciGrup = new String[4];
        birinciGrup[0] = "Ali";
        birinciGrup[2] = "Ayse";
        birinciGrup[1] = "Burak";
        //  birincigrup      Ali    Ayse   BUrak  Umut
        //  ikincigrup       Mehmet Hamza  Fatma  Cetin
        //  Ucuncu grup      Elif   Esref  Emre   Bayram
        String[][] sinif = new String[3][4];// ilk sayi satir sayisini verir   ikinci sayi ise sutun sayisini
//        sinif[0] = birinciGrup;
        System.out.println("birinci grup " + Arrays.toString(sinif[0]));
        //ucuncu grup ucuncu sira indeks no 2
        sinif[2][0] = "Elif";
        sinif[2][1] = "Esref";
        sinif[2][2] = "Emre";
        sinif[2][3] = "Bayram";
        System.out.println("Arrays.toString(sinif[2]) = " + Arrays.toString(sinif[2]));
        System.out.println("sinif[2][3] = " + sinif[2][3]);


        sinif[0][0] = "ALI";
        sinif[0][1] = "Ayse";
        sinif[0][2] = "Burak";
        sinif[0][3] = "Umut";
        System.out.println("Arrays.toString(sinif[0]) = " + Arrays.toString(sinif[0]));
        String birinciGrupBirinci = sinif[0][0];
        System.out.println("birinciGrupBirinci.toLowerCase() = " + birinciGrupBirinci.toLowerCase());
        System.out.println("sinif[0][0].toLowerCase() = " + sinif[0][0].toLowerCase());
        sinif[1][3] = "Cetin";
        sinif[1][2] = "Fatma";
        sinif[1][1] = "Hamza";
        sinif[1][0] = "Mehmet";
        System.out.println("Arrays.deepToString(sinif) = " + Arrays.deepToString(sinif));
        System.out.println("Arrays.toString(sinif[1]) = " + Arrays.toString(sinif[1]));
        System.out.println("sinif[1][1] = " + sinif[1][1]);
        //  sinif iiki boyutlu bir array 3 tane lementi var her bir elementi ise bir array
        System.out.println("sinif.length = " + sinif.length);

        Arrays.toString(sinif[0]);
        Arrays.toString(sinif[1]);
        Arrays.toString(sinif[2]);
        System.out.println(sinif[1][1]);
//        for (int i = 0; i < 3; i++) {
        for (int i = 0; i < sinif.length; i++) {//satira ulasmami saglar
            System.out.println("Arrays.toString(sinif[i]) = " + Arrays.toString(sinif[i]));
            for (int n = 0; n < sinif[i].length; n++) {//sutunlari veriyor
                System.out.println("sinif[i][n] = " + sinif[i][n]);
            }
        }

    }
}

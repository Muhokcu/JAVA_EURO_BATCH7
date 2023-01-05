package gunler.gun37_19_12_2022;
import java.util.Arrays;
public class D3IkiBoyutluArrayler2 {
    public static void main(String[] args) {
        //  birinci  sira            80   90  70  100
        //  ikinci   sira            90    70  60  80
        //  ucuncu   sira            70   60   100 90
        //
        int[][] notlar = {
                {80, 90, 70, 100},
                {90, 70, 60, 80},
                {70, 60, 100, 90}
        };
        int[] aliNot = {10, 5, 9, 8};
        System.out.println("Arrays.toString(aliNot) = " + Arrays.toString(aliNot));

        System.out.println("Arrays.toString(notlar[0]) = " + Arrays.toString(notlar[0]));
        System.out.println("Arrays.toString(notlar[1]) = " + Arrays.toString(notlar[1]));
        System.out.println("Arrays.toString(notlar[2]) = " + Arrays.toString(notlar[2]));

        for (int i = 0; i < 3; i++) {
            System.out.println("Arrays.toString(notlar[i]) = " + Arrays.toString(notlar[i]));
        }
//     int[] aliNot = {10, 5, 9, 8};
        for (int not : aliNot) {
            System.out.println("not = " + not);
        }
        System.out.println("for each calisiyor");
        for (int[] sira : notlar) {// herbir satira ulasmak icin
            System.out.println("Arrays.toString(sira) = " + Arrays.toString(sira));
        }
// for each her bir element icin
        System.out.println("her bir elementi yazdiriyoruz");
        for (int[] sira : notlar) {
            for(int not:sira){
                System.out.print(" " + not);
            }
            System.out.println();
        }

    }
}

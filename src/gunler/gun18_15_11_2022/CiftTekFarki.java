package gunler.gun18_15_11_2022;

public class CiftTekFarki {
    public static void main(String[] args) {
        // 1000 e kadar oalan sayilardan cift olanrin top tek olanlari farkiini yao
        int ciftToplam = 0;
        int tekToplam = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0)
                ciftToplam += i;
            else {
                tekToplam += 1;
            }

        }
        int fark = ciftToplam - tekToplam;
        System.out.println(fark);




        /*public class CiftTekFarki {

            public static void main(String[] args) {

                // 1000 kadar olan sayilardan cift olanlarin toplami ile tek olanlarin
                // toplaminin farkini bulan bir program yazalim

                int topamCift = 0;
                int toplamTek = 0;

                for (int i = 1; i <= 1000; i++) {
                    if (i % 2 == 0) {
                        topamCift += i;
                    } else {
                        toplamTek += i;
                    }
                }

                int fark = topamCift - toplamTek;
                System.out.println("fark = " + fark);

            }}
*/


    }
}

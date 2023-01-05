package gunler.gun17_14_11_2022;

public class Sum {

    public static void main(String[] args) {
        // 0 dan 50 ye kadar sayilarin toplam
        int i = 0;
        int son = 50;
        int sum = 0;

        do {
            sum = sum + i;
            i++;
            //System.out.println(sum);

        } while (i < son);
        System.out.println(sum);
//-----------------------------------------------------------
        i = 0;
        son = 50;
        int toplam = 0;
        while (i < son) {
            toplam = toplam + i;//bu burda
            i++;
        }
        System.out.println("Toplam = " + toplam);
        System.out.println("toplam == sum " + (toplam == sum));
        //----------------------------------------------------------
        int baslangic = 50;
        int bitis = 0;
        int sonToplam = 0;
        while (baslangic > bitis) {
            baslangic--;// neden burda
            sonToplam = sonToplam + baslangic;


        }
        System.out.println("Son toplam = " + sonToplam);

    }
}

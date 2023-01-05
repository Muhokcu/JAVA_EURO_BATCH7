package gunler.gun37_19_12_2022;

public class D4UcBoyutluArray {
    public static void main(String[] args) {
        int numara = 50;

        //       ilk tablo
        //  Alinin notlari         10  5  7  8
        //  Velinin notlari         6   4  9  5
        //  Aysenin notlar          8   9  3  10

        //      ikinci tablo
        //  Alinin cozdugu sorular  50  60 70 30
        //  Velinin cozdugu sorular 40  50 30 90
        //  Aysenin cozdugu sorular 60  70 80 20

        int[] alininNotlari = {10, 5, 7, 8};
        int[] velininNotlari = {6, 4, 9, 5};
        int[] ayseninNotlari = {8, 9, 3, 10};

//        int[] notlar[] = {
//                {10, 5, 7, 8},
//                {6, 4, 9, 5},
//                {8, 9, 3, 10}
//        };
        int[][] notlar = new int[3][4];
        notlar[0] = alininNotlari;
        notlar[1] = velininNotlari;
        notlar[2] = ayseninNotlari;
        System.out.println("notlar[0][3] = " + notlar[0][3]);
        System.out.println("notlar[1][2] = " + notlar[1][2]);
        System.out.println("notlar[2][0] = " + notlar[2][0]);

        //      ikinci tablo
        //  Alinin cozdugu sorular  50  60 70 30
        //  Velinin cozdugu sorular 40  50 30 90
        //  Aysenin cozdugu sorular 60  70 80 20
        int[][] sorular = {
                {50, 60, 70, 30},
                {40, 50, 30, 90},
                {60, 70, 80, 20}
        };
        int[][][] ogrencilerinSorulariVeNotlari = new int[2][3][4];// tablo -- sira--  sayi
        ogrencilerinSorulariVeNotlari[0] = notlar;
        ogrencilerinSorulariVeNotlari[1] = sorular;

        System.out.println("ogrencilerinSorulariVeNotlari[0][1][0] = " + ogrencilerinSorulariVeNotlari[0][1][0]);


        //       ilk tablo
        //  Alinin notlari         10  5  7  8
        //  Velinin notlari         6   4  9  5
        //  Aysenin notlar          8   9  3  10

        //      ikinci tablo
        //  Alinin cozdugu sorular  50  60 70 30
        //  Velinin cozdugu sorular 40  50 30 90
        //  Aysenin cozdugu sorular 60  70 80 20

        System.out.println("ogrencilerinSorulariVeNotlari[0][2][3] = " + ogrencilerinSorulariVeNotlari[0][2][3]);
        System.out.println("ogrencilerinSorulariVeNotlari[1][1][1] = " + ogrencilerinSorulariVeNotlari[1][1][1]);
        System.out.println("ogrencilerinSorulariVeNotlari[1][2][2] = " + ogrencilerinSorulariVeNotlari[1][2][2]);

    }
}

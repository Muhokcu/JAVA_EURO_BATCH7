package gunler.gun34_13_12_2022;

public class D1_Array {
    public static void main(String[] args) {
        // Array deklere etme
        // 1. yol
        int[] sayilar;
        String[] kelimelere;
        double[] oranlar;


        // 2. yol
        int sayilar2[];
        String kelimeler2[];
        double oranlar2[];


        // Array create etme
        // 1. yol / farkli statement ile olusturma
        int[] sayilar3;
        sayilar3 = new int[5];

        // 2. yol / ayni statement icende creat icinde olusturma
        int[] sayilar4 = new int[5];

        // int[5] sayilar5 = new int[]; bu hatali bir yapi atama sadece esitligin saginda yapilir

        // Array degerlere ulasma
        int[] sayilar6 = new int[5];
        // 1 2 3 4 5
        // Array elementlerine deger assign etme
        sayilar6[0] = 10; //1. element
        sayilar6[1] = 5;  //2. element  // eger bunu cikarirsak asagida 0 olarak sonuc aliriz
        sayilar6[2] = 5;  //3. element
        sayilar6[3] = 5;  //4. element
        sayilar6[4] = 5;  //5. element

        // array elementlerinin degerlerine ulasma
        System.out.println("sayilar6[0] = " + sayilar6[0]);
        System.out.println("sayilar6[1] = " + sayilar6[1]);
        System.out.println("sayilar6[2] = " + sayilar6[2]);
        System.out.println("sayilar6[3] = " + sayilar6[3]);
        System.out.println("sayilar6[4] = " + sayilar6[4]);


    }
}

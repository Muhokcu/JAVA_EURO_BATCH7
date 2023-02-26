package gunler.gun12_04_11_2022;

public class LogicalOperatorler2 {
    public static void main(String[] args) {
        boolean gunHaftaSonumu;
        boolean gunCumartesimi = false;
        boolean gunPazarmi = false;
        gunHaftaSonumu = gunCumartesimi || gunPazarmi;
        System.out.println("gunHaftaSonumu = " + gunHaftaSonumu);

        boolean gunHaftaicimi = !gunCumartesimi && !gunPazarmi;
        gunHaftaicimi = !gunHaftaSonumu;
        System.out.println("gunHaftaicimi = " + gunHaftaicimi);
        // ! boolean degeri tersine cevirir
        // true ise false false ise true yapar
        System.out.println(!true);
        System.out.println(!false);
        boolean not = true;
        System.out.println("!not = " + !not);

        int no = -20;
        boolean pozitifSayi = no >= 0;
        System.out.println("numara pozitif bir sayi mi? = " + pozitifSayi);
        boolean negatifSayimi = !pozitifSayi;
        System.out.println("numara negatif bir sayimi? " + negatifSayimi);

        no = 80;
        // 10    30   50   70  100

        //  20 -40    60 -80 -------> true
        boolean sonuc;
        sonuc = no >= 20 && no <= 40 || no >= 60 && no <= 80;
        System.out.println("sonuc = " + sonuc);
        no = 100;
        boolean numara2Hanelimi;
        numara2Hanelimi = no >= 10 && no <= 99;
        //                numara > 9 && numara < 100
        System.out.println("numara2Hanelimi = " + numara2Hanelimi);

    }
}

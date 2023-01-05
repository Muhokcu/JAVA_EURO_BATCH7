package gunler.gun12_04_11_2022;

public class LogicalOperatorler2 {
    public static void main(String[] args) {
        boolean gunHaftasonu;
        boolean gunCumartesimi = false;
        boolean gunPazarmi = true;
        gunHaftasonu = gunCumartesimi || gunPazarmi;
        System.out.println("gunHaftasonu = " + gunHaftasonu);

        boolean gunHaftaicimi = !gunCumartesimi && !gunPazarmi; //1. yonyem
        gunHaftaicimi = !gunHaftasonu; // 2. yontem
        System.out.println("gunHaftaicimi = " + gunHaftaicimi);
        System.out.println(!true);
        System.out.println(!false);
        boolean not = true;
        System.out.println("!not = " + !not);
        int no = -20;
        boolean pozitifSayi = no >= 0;
        System.out.println("no pozitif Sayimi = " + pozitifSayi);
        boolean negatifSayimi = !pozitifSayi;
        System.out.println("no negatif bir sayimi = " + negatifSayimi);
        no = 140;
        boolean sonuc;
        sonuc = no > 20 && no < 40 || no > 60 && no < 80;
        System.out.println("sonuc = " + sonuc);
        sonuc   =no>=10 && no <100;
        System.out.println("sonuc = " + sonuc);

    }
}

package gunler.gun12_04_11_2022;

public class LogicalOperatorler {
    public static void main(String[] args) {
        // &&and.ve   || or.veya    !not.degil


        boolean gunHaftasonumu = true;
        boolean sicaklik20Ustumu = true;
        boolean piknigeGidiyormuyuz = gunHaftasonumu && sicaklik20Ustumu;
        System.out.println("piknigeGidiyormuyuz = " + piknigeGidiyormuyuz);
        gunHaftasonumu = false;
        sicaklik20Ustumu = true;
        piknigeGidiyormuyuz = gunHaftasonumu && sicaklik20Ustumu;
        System.out.println("piknigeGidiyormuyuz = " + piknigeGidiyormuyuz);
        int a = 10;
        int b = 20;
        System.out.println(a < b && ++a >= 11);
        System.out.println("a = " + a);
    }
}

package gunler.gun12_04_11_2022;

public class LogicalOperatorler {
    public static void main(String[] args) {
        //   &&   ||    !
        //   and  or    not
        //   ve  veya   degil

        //  gun haftasonu                cumartesi    true  true   carsamba    false   false
        // sicaklik 20 uzeri               30         true          30          true

        //   pazar    true        false       carsamba   false      false
        //    10       false                      5      false

        boolean gunHaftaSonumu = true;// cumartesi
        boolean sicaklik20Ustumu = true;// 30
        boolean piknigeGidiyormuyuz = gunHaftaSonumu && sicaklik20Ustumu;
        System.out.println("piknigeGidiyormuyuz = " + piknigeGidiyormuyuz);
        gunHaftaSonumu = false;
        sicaklik20Ustumu = true;// 30
        piknigeGidiyormuyuz = gunHaftaSonumu && sicaklik20Ustumu;
        System.out.println("piknigeGidiyormuyuz  " + piknigeGidiyormuyuz);
        int a = 10;
        int b = 20;

        System.out.println(a < b && ++a > 5);// ilk ifade yalnis ise ikinci kismi compile etmez
        System.out.println("a = " + a);
        System.out.println(a > b || ++a > 5);//
        System.out.println("a = " + a);
    }
}

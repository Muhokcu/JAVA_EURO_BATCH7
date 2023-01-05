package gunler.gun12_04_11_2022;

public class IfStatements {
    public static void main(String[] args) {

        int a = 10;
        if (a == 20) {
            System.out.println("sonuc dogrudur");

        } else {
            System.out.println("else blogu calistirildi cunku sart ifadesi yanlis cikti");
        }
        int not = 90;
        double harclik = 100;
        boolean notSonuc = not > 90;
        if (not > 90) {
            System.out.println("basarili");

        } else {
            System.out.println("basarisiz");
        }
        not = 100;
        if(not==100){
            System.out.println("super");// tek satir yazdigimizdan sussulu parantez ...
            System.out.println("harika");
        }

    }
}

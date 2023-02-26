package gunler.gun12_04_11_2022;

public class IfStatements {
    public static void main(String[] args) {
        int a = 20;
        if (a == 20) {
            System.out.println("sonuc dogrudur");
        } else {
            System.out.println("else blogu calsitirildi cunki sart ifadesi yalnis ciktigi icin");
        }
        int not = 70;
        double harclik = 100;

        if (not > 90) {
            System.out.println("tebrikler");
        } else {
            System.out.println("daha cok calis....");
        }

        not = 100;
        boolean notSonuc = not > 90;

        if (notSonuc) {
            System.out.println("tebrikler");
        } else {
            System.out.println("daha cok calis....");
        }
        not = 100;

        if (not == 100)
            System.out.println("superr!!!"); // tek satir yazdigimizdan suslu parantezi silsek dahi hata almadik
        System.out.println("harika");

    }
}

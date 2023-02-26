package gunler.gun11_02_11_2022;

public class IfStatementExercises {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        // if (x equals 42 ){ } wrong
        // if x = 10 then { } wrong
        if (x == y) { }  // correct
        // if (x => y) { } // wrong
        // if [x == 10] { } // wrong

        // Write an if statement that multiplies salary by 1.5 if hours is greater than 38
        // Eger Calisma saati 38 den buyuk ise maasi 1.5 ile carpan bir if statement yaziniz

        double salary = 50000;
        int hours  = 39;

        if (hours > 38){
            salary *= 1.5;
        }

        System.out.println("Toplam odenen maas = " + salary);

        // Write an if statement that assigns 1 to x if y is greater than 0
        // Eger y sifirdan buyuk ise x e 1 degerini atayan bir if statement yaziniz

        int x1 = 0;
        int y1 = 5;

        if (y1 > 0){
            x1 = 1;
        }

        System.out.println("x1 = " + x1);

        // Write an if statement that increases pay by 3% if score is greater than 90
        // Eger score 90 dan buyuk ise odeme ye 3% artis ekleyen bir if statement yaziniz

        int score = 100;
        int pay = 1000;

        if (score > 90){
            pay += (pay * 3 / 100);
        }

        System.out.println("pay = " + pay);

    }
}

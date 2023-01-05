package gunler.gun11_02_11_2022;

public class IfStatementExercises {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;


        // if (x equals 42 ){} Wrong/ hata
        // if x =10 then wrong / hata
        if (x == y) {
        } // correkt
        //if (x=>y){} // Wrong
        // if [ x == 10] {} Wrong

        // Write an if statement that multiplies salary by 1.5 if hours is greater than 38
        int salary = 5000;
        int hours = 40;
        double sum;
        if (hours > 38) {
            sum = salary * 1.5;
            System.out.println("Toplam odenen maas = " + sum);

            // Write an if statement that assigns 1 to x if y is greater than 0
            // y sifirdan buyuk ise xe 1 degerini atayan if statement yaziniz

            int x1 = 0;
            int y1 = 5;
            if (y1 > 0) {
                x1 = 1;

                System.out.println("x1 = " + x1);

                int score = 100;
                int pay = 1000;

                if (score > 90) {
                    pay += (pay * 3 / 100);
                    System.out.println("pay = " + pay);


                }


            }


        }
    }
}

package gunler.gun21_21_11_2022;

public class LastDigit {
    public static void main(String[] args) {
        //lastDigit( 7, 17) true
        //lastDigit( 6, 17) false
        //lastDigit( 3, 113) true
        int a = 155;
        int b = 17;
        boolean sonRakamayni = false;
        if (a % 10 == b % 10) {
            sonRakamayni= true;
        }
        System.out.println("sonRakamayni = " + sonRakamayni);
        sonRakamayni=(a%10==b%10) ? true: false;
        System.out.println("sonRakamayni = " + sonRakamayni);
    }
}

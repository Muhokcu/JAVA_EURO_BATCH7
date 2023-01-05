package gunler.gun21_21_11_2022;

public class Warmup1LastDigit {
    public static void main(String[] args) {
        // Negatif olmayan iki int değeri göz önüne alındığında, 27 ve 57
        // gibi aynı son basamağa sahiplerse true değerini döndürün. % "Mod" operatörünün kalanları hesapladığını unutmayın,
        // bu nedenle% 17 10 7'dir.
        //Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note
        // that the % "mod" operator computes remainders, so 17 % 10 is 7.
        //lastDigit ( 7, 17 ) → doğru
        //lastDigit ( 6, 17 ) → yanlış
        //lastDigit ( 3, 113 ) → doğru
        int a = 11;
        int b = 17;
        boolean sonRakamlarAyni = true;
        if (a % 10 == b % 10) {
            System.out.println("son rakamlar ayni");
        } else {
            sonRakamlarAyni = false;
            System.out.println("son rakamalar ayni degil");
        }
        System.out.println("sonRakamlarAyni = " + sonRakamlarAyni);

    }
}

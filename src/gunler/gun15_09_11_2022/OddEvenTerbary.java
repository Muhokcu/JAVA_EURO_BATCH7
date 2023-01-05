package gunler.gun15_09_11_2022;

public class OddEvenTerbary {
    public static void main(String[] args) {
        int num = -22;
        String message;
        if (num % 2 == 0) {
            message = "Even Number";
        } else {
            message = "Odd number";
        }
        System.out.println(num + " Sayısı Tek Sayıdır");
        message = (num % 2 == 0) ? "Even Number" : "Odd Number ";
        System.out.println("message = " + message);
        // sayinin sifirdan buyuk olup oladigini kontrol et
        if (num > 0) {
            message = (num % 2 == 0) ? "Even Number " : " odd Number";
            System.out.println("sayi sifirdan buyuk ve cifttir");
        } else {
            message = "odd number";
            System.out.println("message = " + message);
        }

    }

}








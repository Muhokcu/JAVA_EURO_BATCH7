package gunler.gun29_05_12_2022;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class MathRandomDate {
    public static void main(String[] args) {
        Random herhangiSayi = new Random();
        int sayi = herhangiSayi.nextInt(10, 30);
        System.out.println("sayi = " + sayi);

        Math.min(10, 20);// metotlar static oldugundan sinif ismiyle cagiriyoruz
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern(" hh : mm");
        System.out.println("dateTimeFormatter.format(localTime) = " + dateTimeFormatter.format(localTime));

    }
}

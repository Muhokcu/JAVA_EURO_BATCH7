package gunler.gun29_05_12_2022;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Tarih {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        //  2022-12-05   yil ay gun  yyyy MM dd
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("format(localDate) = " + dateTimeFormatter.format(localDate));
        System.out.println("localDate.getDayOfMonth() = " + localDate.getDayOfMonth());
        System.out.println("localDate.getYear() = " + localDate.getYear());
    }}
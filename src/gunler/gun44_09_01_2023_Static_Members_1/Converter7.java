package gunler.gun44_09_01_2023_Static_Members_1;

public class Converter7 {
    public static double milesToKilometers(double mile) {
        return mile * 1.609;

    }

    public static double kilometersToMiles(double km) {
        return km / 1.609;


    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celciusToFahrenheit(double c) {
        return (c * 1.8) + 32;

    }

    public static double centimetesToInches(double cm) {
        return cm * 0.39;

    }

    public static double inchesToCentimeters(double in) {
        return in / 0.39;

    }

    public static double kdvHesapla(double miktar) {
        return miktar * 0.18;
    }
    public static double boyKiloIndex(double boy, double kilo){
        return kilo/(boy*boy);
    }
}





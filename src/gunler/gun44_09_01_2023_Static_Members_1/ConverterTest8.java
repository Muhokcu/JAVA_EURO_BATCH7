package gunler.gun44_09_01_2023_Static_Members_1;

public class ConverterTest8 {
    public static void main(String[] args) {
        System.out.println("Converter.milesToKilometers(100) = " + Converter7.milesToKilometers(100));

        System.out.println("Converter.kilometersMiles(160.9) = " + Converter7.kilometersToMiles(160.9));

        System.out.println("Converter.fahrenheitToCelsius(85) = " + Converter7.fahrenheitToCelsius(85));

        System.out.println("Converter.celsiusTofahrenheit(29.444444444444443) = " + Converter7.celciusToFahrenheit(29.444444444444443));

        System.out.println("Converter.centimetersToInches(100) = " + Converter7.centimetesToInches(100));
        System.out.println("Converter.inchesToCentimeters(39) = " + Converter7.inchesToCentimeters(39));

        System.out.println("Converter.kdvHesapla(100) = " + Converter7.kdvHesapla(100));

        System.out.println("Converter.boyKiloIndex(1.78,85) = " + Converter7.boyKiloIndex(1.78, 85));
        if (Converter7.boyKiloIndex(1.78,85)>20){
            System.out.println("Obez.........");
        }
    }
}

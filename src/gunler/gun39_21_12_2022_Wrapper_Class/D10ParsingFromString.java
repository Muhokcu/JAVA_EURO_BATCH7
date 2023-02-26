package gunler.gun39_21_12_2022_Wrapper_Class;

public class D10ParsingFromString {
    public static void main(String[] args) {

        String stringNumber = "2022";
        int number = Integer.valueOf(stringNumber);// integer number cevirme  = birinci yol
        int number2 = Integer.parseInt(stringNumber);// integer number cevirme  = ikinci yol
        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);

        number = number + number2;
        System.out.println("number = " + number);

        stringNumber = stringNumber + 5;
        System.out.println("stringNumber = " + stringNumber);
        number = number + 5;
        System.out.println("number = " + number);

        Double number3 = Double.parseDouble(stringNumber);
        System.out.println("number3 = " + number3);

        String str = "2022A";
        // int number4= Integer.parseInt(str);
        // System.out.println("number4 = " + number4);  Error = NumberFormatException


    }
}

package gunler.gun39_21_12_2022;

public class D4CharacterMethods {
    public static void main(String[] args) {
        System.out.println("Character.isAlphabetic('c') = " + Character.isAlphabetic('c'));
        System.out.println(Character.isAlphabetic('2'));
        System.out.println("Character.isAlphabetic(' ') = " + Character.isAlphabetic(' '));

        System.out.println("Character.isLetter('G') = " + Character.isLetter('G'));
        System.out.println(Character.isLetter('9'));
        System.out.println(Character.isLetter('%'));
        System.out.println(Character.isDigit('3'));
        System.out.println(Character.isDigit('J'));

        String str = "Java2022";
        System.out.println("Character.isAlphabetic(str.charAt(0)) = " + Character.isAlphabetic(str.charAt(0)));
        System.out.println("Character.isAlphabetic(str.charAt(5)) = " + Character.isAlphabetic(str.charAt(5)));
        System.out.println(Character.isDigit(str.charAt(4)));
        System.out.println(Character.isLetter(str.charAt(3)));
        System.out.println(Character.isDigit(str.charAt(3)));

    }
}

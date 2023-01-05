package gunler.gun31_07_12_2022;

public class String_CharAt {
    public static void main(String[] args) {
        String word = "Computer";
        System.out.println(word.length());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(5));
        System.out.println(word.charAt(6));
        System.out.println(word.charAt(7));
        // System.out.println(word.charAt(8)); ilk karakter 0 ile basladigi icn burda hata veriyor = length = -1

        String word2 = "Apple";
        System.out.println(word2.charAt(0));
        if (word2.charAt(0) == 'A') {
            System.out.println("Ilk karakteriniz A dir");


        } else {
            System.out.println("ILK karakter A degildir");

        }
        String word3 = "civic";
        if (word3.charAt(1) == word3.charAt(3)) {
            System.out.println("word3.charAt(1) = " + word3.charAt(1));
            System.out.println("word3.charAt(1) = " + word3.charAt(3));
            System.out.println("karakterler esittir");
        } else {
            System.out.println("Karaketler esit degildir");
        }
    }
}

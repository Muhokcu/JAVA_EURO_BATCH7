package gunler.gun15_09_11_2022;

public class IfElseToTernary {
    public static void main(String[] args) {
        int num = 15;
        // if else
        if (num > 0) {
            System.out.println("positiv number");
        } else {
            System.out.println("negative number");
        }

        // Ternary
        String result = (num > 0) ? "postive number " : "negative number ";
        System.out.println("result = " + result);
        // 2 . yontem
        System.out.println((num > 0) ? "positive number " : "negative number ");

    }
}

package gunler.gun29_05_12_2022;
import java.util.Random;
public class RandomTest {
    public static void main(String[] args) {
        Matematik matematik = new Matematik();
        matematik.toplama(1, 5);
        Random rastgele = new Random();
        System.out.println("rastgele.nextInt() = " + rastgele.nextInt(10, 100));


    }
}

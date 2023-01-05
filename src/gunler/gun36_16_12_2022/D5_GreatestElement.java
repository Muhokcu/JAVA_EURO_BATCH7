package gunler.gun36_16_12_2022;

import java.util.Arrays;

public class D5_GreatestElement {
    public static void main(String[] args) {

        // Bir array icerisindeki en buyuk degere sahip elementi bularak tum elementleri o degere esitleyin

        int[] x = {3, 4, 5, 6, 12, 8}; // 12
        int[] y = {14, 22, 35, 12, 41}; // 41
        int[] z = {0, 5, 28, 1, 76, 0, 1}; // 76

        System.out.println(Arrays.toString(greatest(x)));
        System.out.println(Arrays.toString(greatest(y)));
        System.out.println(Arrays.toString(greatest(z)));

    }

    public static int[] greatest(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > max) {
                max = arr[i + 1];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = max;
        }

        return arr;
    }
}

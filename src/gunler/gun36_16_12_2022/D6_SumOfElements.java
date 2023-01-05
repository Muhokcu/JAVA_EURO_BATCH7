package gunler.gun36_16_12_2022;

import java.util.Arrays;

public class D6_SumOfElements {
    public static void main(String[] args) {
        // 2 adet arrayin elementlerinin toplami buyuk olani gosteren bir method yaziniz

        int[] x = {3, 4, 5, 6, 12, 8};
        int[] y = {14, 22, 35, 12, 41};
        int[] v = {10, 52, 258, 19, 76, 0, 13};
        int[] z = {0, 5, 28, 1, 76, 0, 1};

        System.out.println(Arrays.toString(sumOfElements(x, y)));
        System.out.println(Arrays.toString(sumOfElements(v, z)));

    }

    public static int[] sumOfElements(int[] arr1, int[] arr2) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }

        for (int value : arr2) {
            sum2 += value;
        }

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

        if (sum1 > sum2) {
            return arr1;
        } else {
            return arr2;
        }
    }
}

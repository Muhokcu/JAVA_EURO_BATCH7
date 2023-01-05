package gunler.gun24_25_11_2022;

public class Quiz2 {
    public static void main(String[] args) {
        int a = 10, b = 14;
        boolean x = (a > b) ? true : false;

        int k = 0;
        int m = 0;
        int i;
        for (i = 0; i <= 3; i++) {// 0 1 2
            k++;// 1 2 3
            if (i == 2) {
                i = 4;
                break;
            }
            m++;//1 2
        }
        System.out.println("i = " + i);//4
        System.out.println("k = " + k);//3
        System.out.println("m = " + m);//2

        int sum = 0;
        for (int n = 0; n < 10; n++) {
            if (n % 3 == 0) {
                sum = sum + n;// 3 6 9
            }

        }
        System.out.println("sum = " + sum);


        switch (sum) {

            case 10:
                System.out.println(sum);
                break;

            case 20:
                System.out.println(sum);
                break;
            default:
                System.out.println("deneme");
                break;
        }
    }
}

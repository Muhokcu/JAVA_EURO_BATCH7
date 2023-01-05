package gunler.gun34_13_12_2022;

public class D5_AlternativeYol {
    public static void main(String[] args) {
// 1. yol
        int [] numbers;

        // 2. yol
        int numbers2 [];

        // 3. yol
        int [] number3, number4, number5;

        // 4. yol
        int number6, numbers7, numbers8 [];

        // 5. yol
        int numbers9 [], numbers10 [], numbers11 [];


        // Alternative array olusturma
        int [] myArray = {10, 25, 35, 45, 55};

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);
        //System.out.println(myArray[5]); // Error / ArrayIndexOutOfBoundsException

        //myArray[5] = 12; // Error / ArrayIndexOutOfBoundsException
        // Array sabit kapasite de oldugu icin yeni index ile genisleme mumkun degil dolayisiyle index hatasi aliyoruz
        //System.out.println(myArray[5]);

        myArray[2] = 135; // Array icerisindeki degiskene yeniden deger assign etmek mumkun
        // Ancak bir array a yeni degisken eklemek mumkun degil // fixed Size
        System.out.println(myArray[2]);

        // Tum dizi, degisiklikle birlikte
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]); // 135
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);

//        int [] myList;
//        myList = {1,2,3}; // Bu sekilde array olustururken deger assign etme ayni satirda olmali
//                          // once deklare sonra assign mumkun degil
    }
}

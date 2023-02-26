package gunler.gun53_24_01_2023;

import java.util.Arrays;

public class D4FinalArrays {
    int[] arrNumber = new int[3];
    final int[] fnlArrNumber = new int[3];

    public static void main(String[] args) {
        D4FinalArrays fnlArray = new D4FinalArrays();
        fnlArray.arrNumber[0] = 5;
        fnlArray.arrNumber[1] = 23;
        fnlArray.arrNumber[2] = 89;

        // asagidaki iki methodta da arrayler yazdirilabilir
        System.out.println("Arrays.toString(fnlArray.arrNumber) = " + Arrays.toString(fnlArray.arrNumber));

        for (int i = 0; i < fnlArray.arrNumber.length; i++) {
            System.out.println("fnlArray.arrNumber[i] = " + fnlArray.arrNumber[i]);

        }
        fnlArray.arrNumber[2] = 9;
        System.out.println("Arrays.toString(fnlArray.arrNumber) = " + Arrays.toString(fnlArray.arrNumber));
        System.out.println("Arrays.toString(fnlArray.fnlArrNumber) = " + Arrays.toString(fnlArray.fnlArrNumber));
        fnlArray.fnlArrNumber[0] = 23;//
        fnlArray.fnlArrNumber[1] = 29;// bu uc atamada da final kisitlama yapmiyor
        fnlArray.fnlArrNumber[2] = 45;//
        System.out.println("Arrays.toString(fnlArray.fnlArrNumber) = " + Arrays.toString(fnlArray.fnlArrNumber));

        int[] birArray = new int[3];
        fnlArray.arrNumber = birArray;// burda arrayde degisiklik yapabildik
        //fnlArray.fnlArrNumber=birArray;// fakt burda izin vermiyor final oldugu icin // can not be assigned another arrays reference
        System.out.println("Arrays.toString(fnlArray.arrNumber) = " + Arrays.toString(fnlArray.arrNumber));



        //   for (int j = 0; j < fnlArray.fnlArrNumber.length; j++) {
        //  System.out.println("fnlArray.fnlArrNumber[i] = " + fnlArray.fnlArrNumber[i]);


    }
}

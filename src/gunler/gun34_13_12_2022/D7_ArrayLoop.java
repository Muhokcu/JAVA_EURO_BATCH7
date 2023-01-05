package gunler.gun34_13_12_2022;

public class D7_ArrayLoop {
    public static void main(String[] args) {
        int[] myList = {15, 73, 76, 27, 87, 12, 98, 98, 98, 98};
        System.out.println("myList[0] = " + myList[0]);
        System.out.println("myList[1] = " + myList[1]);
        System.out.println("myList[2] = " + myList[2]);
        System.out.println("myList[3] = " + myList[3]);
        System.out.println("myList[4] = " + myList[4]);
        System.out.println("myList[5] = " + myList[5]);
        System.out.println("myList[6] = " + myList[6]);
        System.out.println("myList[7] = " + myList[7]);
        System.out.println("myList[8] = " + myList[8]);
        System.out.println("myList[9] = " + myList[9]);
        System.out.println("--------------------");

        System.out.println("myList.length = " + myList.length);
        for (int i = 0; i < myList.length; i++) {
            System.out.print(" " + myList[i] + " ");
        }

    }
}

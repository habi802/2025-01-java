package ch05.sec06;

import java.util.Arrays;

public class Mission03 {
    public static void main(String[] args) {
        int[] arr = { 10, 250, 30, 50, 75 };
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------");
        //
        int arrMax = arr.length - 1;
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arrMax) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

//        System.out.print("[" + arr[0]);
//        for (int i = 1; i < arr.length; i++) {
//            System.out.print(", " + arr[i]);
//        }
//        System.out.print("]");
    }
}

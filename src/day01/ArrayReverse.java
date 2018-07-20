package day01;

import java.util.Arrays;

public class ArrayReverse {

    public static int[] reverseArray(int[] arr) {
        System.out.println("Input: " + Arrays.toString(arr));
        int[] tempArr = new int[arr.length];
        int counter = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            tempArr[counter] = arr[i];
            counter++;
        }

        return tempArr;
    }
}


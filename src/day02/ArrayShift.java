package day02;

import java.util.Arrays;

import static java.lang.Math.ceil;

public class ArrayShift {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5};
        insertShiftArray(arr, 4);
    }

    public static void insertShiftArray(int[] firstArr, int newVal) {
        int length = firstArr.length;
        int[] tempA = new int[(length + 1) / 2];
        int[] tempB = new int[length - tempA.length];

        for (int i = 0; i < length; i++) {
            if (i < tempA.length) {
                tempA[i] = firstArr[i];
            } else {
                tempB[i - tempA.length] = firstArr[i];
            }
        }
        // Create a new array here to add the temp arrays into with the new value
        System.out.println(Arrays.toString(tempA) + newVal + Arrays.toString(tempB));
    }
}

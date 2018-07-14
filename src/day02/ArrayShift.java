package day02;

public class ArrayShift {

    public static int[] insertShiftArray(int[] arr, int newVal) {
        int[] result = new int[arr.length + 1];
        int midIndex = result.length / 2;

        for (int i = 0; i <= midIndex; i++) {
            result[i] += arr[i];
        }
        result[midIndex] = newVal;

        for (int i = midIndex; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }
}

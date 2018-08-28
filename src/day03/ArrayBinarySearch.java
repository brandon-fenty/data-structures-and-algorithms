package day03;


public class ArrayBinarySearch {


    public static int BinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (key < arr[middle]) {
                high = middle - 1;

            } else if (key > arr[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}

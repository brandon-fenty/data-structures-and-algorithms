package day36;

public class MergeSort {

    public void sort(int[] inputArr, int left, int right) {
        // Find the middle, left, and right index of the input
        // and recursively call sort
        if (left < right) {
            int middle = (left + right) / 2;

            sort(inputArr, left, middle);
            sort(inputArr, middle + 1, right);

            merge(inputArr, left, middle, right);
        }
    }

    public void merge(int[] inputArr, int left, int middle, int right) {
        // Find the middle index of the left and right side of
        // the input array
        int lSize = middle - left + 1;
        int rSize = right - middle;
        // Create temp arrays to split the input array and store
        // it's values
        int[] lArr = new int[lSize];
        int[] rArr = new int[rSize];
        // Copy the data from the input array into it's corresponding
        // temp array
        for (int i = 0; i < lSize; i++) {
            lArr[i] = inputArr[left + i];
        }
        for (int j = 0; j < rSize; j++) {
            rArr[j] = inputArr[middle + 1 + j];
        }
        // Declare index variables to for left array, right array
        // and the input array
        int li = 0;
        int ri = 0;
        int ii = left;
        // Begin merging elements from the left && right arrays
        // into the original array
        while (li < lSize && ri < rSize) {
            if (lArr[li] <= rArr[ri]) {
                inputArr[ii] = lArr[li];
                li++;
            } else {
                inputArr[ii] = rArr[ri];
                ri++;
            }
            ii++;
        }
        // Check to see if there are any remaining elements in the
        // left or right arrays and add them to the input array
        while (li < lSize) {
            inputArr[ii] = lArr[li];
            li++;
            ii++;
        }

        while (ri < rSize) {
            inputArr[ii] = rArr[ri];
            ri++;
            ii++;
        }
    }

    public static void printArr(int[] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        System.out.print("]");
    }
}

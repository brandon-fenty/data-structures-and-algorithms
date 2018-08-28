package day36;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MergeSortTest {

    @Test
    void sort() {
        int[] input = {34, 19, 42, -9, 2018, 0, 2005, 77, 2099};
        System.out.println("Input: " + Arrays.toString(input));
        int[] expected = {-9, 0, 19, 34, 42, 77, 2005, 2018, 2099};
        MergeSort sorted = new MergeSort();
        sorted.sort(input, 0, input.length - 1);
        System.out.print("Result: ");
        MergeSort.printArr(input);
    }
}
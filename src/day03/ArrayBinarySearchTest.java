package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayBinarySearchTest {

    @Test
    void binarySearch1() {
        int[] arr = {4,8,15,16,23,42};
        int key = 15;
        int expected = 2;
        int result = ArrayBinarySearch.BinarySearch(arr, key);

        assertEquals(expected, result);
        System.out.println("The number was found at index: " + result);
    }

    @Test
    void binarySearchTest2() {
        int[] arr = {11,22,33,44,55,66,77};
        int key = 90;
        int expected = -1;
        int result = ArrayBinarySearch.BinarySearch(arr, key);

        assertEquals(expected, result);
        System.out.println("The number was found at index: " + result);
    }

    @Test
    void binarySearch3() {
        int[] arr = {9,18,27,36,45,54,63,72,91,100};
        int key = 72;
        int expected = 7;
        int result = ArrayBinarySearch.BinarySearch(arr, key);

        assertEquals(expected, result);
        System.out.println("The number was found at index: " + result);
    }
}
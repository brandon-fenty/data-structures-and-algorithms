package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayShiftTest {

    @Test
    void insertShiftArray1() {
        int[] numbers = {2, 4, 6, 8};
        int n = 5;
        int[] result = ArrayShift.insertShiftArray(numbers, n);

        int[] expected = {2, 4, 5, 6, 8};
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Result: " + Arrays.toString(result));
        assertArrayEquals(expected, result);
    }

    @Test
    void insertShiftArray2() {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int n = 9;
        int[] result = ArrayShift.insertShiftArray(numbers, n);

        int[] expected = {2, 4, 6, 8, 9, 10, 12, 14, 16};
        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Result: " + Arrays.toString(result));
        assertArrayEquals(expected, result);
    }
}
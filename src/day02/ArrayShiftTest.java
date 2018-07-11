package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayShiftTest {

    @Test
    void empty() {
        int[] numbers = {};
        int n = 0;
        ArrayShift.insertShiftArray(numbers, n);

        int[] expected = {};
        assertArrayEquals(expected, numbers);
    }

    @Test
    void insertShiftArray1() {
        int[] numbers = {2, 4, 6, 8};
        int n = 5;
        ArrayShift.insertShiftArray(numbers, n);

        int[] expected = {2, 4, 5, 6, 8};
        assertArrayEquals(expected, numbers);
    }

    @Test
    void insertShiftArray2() {
        int[] numbers = {4, 8, 15, 23, 42};
        int n = 16;
        ArrayShift.insertShiftArray(numbers, n);

        int[] expected = {4, 8, 15, 16, 23, 42};
        assertArrayEquals(expected, numbers);
    }

//    @Test
//    void breakDatShit() {
//        int[] numbers = {2, 4, 6, 8};
//        int n = 9;
//        ArrayShift.insertShiftArray(numbers, n);
//
//        boolean expected = false;
//        assertArrayEquals(expected, numbers);
//    }
}
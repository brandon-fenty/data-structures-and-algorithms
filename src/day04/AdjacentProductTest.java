package day04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static day04.AdjacentProduct.LargestProduct;
import static org.junit.jupiter.api.Assertions.*;

class AdjacentProductTest {

    @Test
    void largestProduct4by3() {
        int[][] aa = {
                {1, 2, 3, 4},
                {2, 3, 4, 1},
                {3, 4, 1, 2}
        };

        System.out.println("Input: " + Arrays.deepToString(aa));
        int expected = 16;
        System.out.println("Expected: " + expected);
        int result = LargestProduct(aa);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void largestProduct4By3() {
        int[][] aa = {
                {1, 2, 1},
                {2, 4, 2},
                {3, 6, 8},
                {7, 8, 1}
        };

        System.out.println("Input: " + Arrays.deepToString(aa));
        int expected = 64;
        System.out.println("Expected: " + expected);
        int result = LargestProduct(aa);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }

    @Test
    void largestProduct3by3() {
        int[][] aa = {
                {9, 2, 3},
                {9, 3, 4},
                {3, 4, 1}
        };

        System.out.println("Input: " + Arrays.deepToString(aa));
        int expected = 81;
        System.out.println("Expected: " + expected);
        int result = LargestProduct(aa);
        System.out.println("Result: " + result);
        assertEquals(expected, result);
    }
}
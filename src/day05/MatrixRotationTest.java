package day05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixRotationTest {

    @Test
    void rotateMatrix1() {
        int[][] aa = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };

        int[][] result = MatrixRotation.rotateMatrix(aa);
        int[][] expected = {{3, 2, 1}, {3, 2, 1}, {3, 2, 1}};

        System.out.println("Expected: " + Arrays.deepToString(expected) + " -- Actual: " + Arrays.deepToString(result));

        assertArrayEquals(expected, result);
    }

    @Test
    void rotateMatrix2() {
        int[][] aa = {
                {3, 6, 9},
                {3, 6, 9},
                {3, 6, 9}
        };

        int[][] result = MatrixRotation.rotateMatrix(aa);
        int[][] expected = {{3, 3, 3}, {6, 6, 6}, {9, 9, 9}};

        System.out.println("Expected: " + Arrays.deepToString(expected) + " -- Actual: " + Arrays.deepToString(result));

        assertArrayEquals(expected, result);
    }

    @Test
    void rotateMatrixHedge() {
        int[][] aa = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };

        int[][] result = MatrixRotation.rotateMatrix(aa);
        int[][] expected = {{4, 3, 2, 1}, {4, 3, 2, 1}, {4, 3, 2, 1}, {4, 3, 2, 1}};

        System.out.println("Expected: " + Arrays.deepToString(expected) + " -- Actual: " + Arrays.deepToString(result));

        assertArrayEquals(expected, result);
    }
}
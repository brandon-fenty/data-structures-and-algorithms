package day04;

import java.util.Arrays;

public class AdjacentProduct {

    public static void main(String[] args) {

        int[][] testyBoi = {
                {1, 2, 3, 4},
                {2, 3, 4, 1},
                {3, 4, 1, 2}
        };

        LargestProduct (testyBoi);
    }

    public static int LargestProduct (int[][] aa) {
        int result = 0;

        for (int row = 0; row < aa.length; row++) {
            for (int col = 0; col < aa[row].length; col++) {
                int largestNum = getValue (aa, row, col);

                if (largestNum > result) {
                    result = largestNum;
                }
            }
        }

        System.out.println(Arrays.deepToString(aa));
        System.out.println("Result: " + result);
        return result;
    }

    public static int getValue (int[][] aa, int row, int col) {
        int largestNum = 0;
        int cell = aa[row][col];

        if ((col + 1) < aa[row].length) {
            largestNum = Math.max(largestNum, cell * aa[row][col + 1]);
        }

        if ((col + 1) < aa[row].length && (row + 1) < aa.length) {
            largestNum = Math.max(largestNum, cell * aa[row + 1][col + 1]);
        }

        if ((row + 1) < aa.length) {
            largestNum = Math.max(largestNum, cell * aa[row + 1][col]);
        }

        if ((row + 1) < aa.length && (col - 1) > 0) {
            largestNum = Math.max(largestNum, cell * aa[row + 1][col -1]);
        }

        return largestNum;
    }
 }

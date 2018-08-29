package day37;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        double[] arr10k = randomN(10000);
        double[] copy = duplicator(arr10k);
        System.out.println("Size of original: " + arr10k.length);
        System.out.println(Arrays.toString(arr10k));
        System.out.println("Size of copy: " + copy.length);
        System.out.println(Arrays.toString(copy));

        System.out.println("Sorted: " + Arrays.toString(selectSort(arr10k)));
        System.out.println("Is it actually sorted? " + isSorted(arr10k));
    }

    public static double[] selectSort(double[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int minIndex = i;

            for (int nextIndex = i + 1; nextIndex < input.length; nextIndex++) {
                if (input[nextIndex] < input[minIndex]) {
                    minIndex = nextIndex;
                }

                double temp = input[minIndex];
                input[minIndex] = input[i];
                input[i] = temp;
            }
        }
        return input;
    }

    public static boolean isSorted(double[] input) {
        int index = 1;

        for (double data : input) {
            if (input[index] < input[index - 1]) {
                return false;
            }
        }

        return true;
    }

    public static double[] duplicator(double[] original) {
        double[] copy = new double[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        return copy;
    }

    public static double[] randomN(int size) {
        double[] randomData = new double[size];

        for (int i = 0; i < size; i++) {
            Random randVal = new Random();
            randomData[i] = randVal.nextDouble() * 10000;
        }

        return randomData;
    }
}

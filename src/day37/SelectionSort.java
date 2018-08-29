package day37;

import com.sun.scenario.effect.Merge;
import day36.MergeSort;

import java.util.Arrays;
import java.util.Random;

import static day37.MergeSortDouble.sort;

public class SelectionSort {
    public static void main(String[] args) {
        // Array with 10,000 data points
        double[] arr10k = randomN(10000);
        double[] copy10k = duplicator(arr10k);

        // Array with 100,000 data points
        double[] arr100k = randomN(100000);
        double[] copy100k = duplicator(arr100k);

        // Array with 10,000,000 data points
        double[] arr1mil = randomN(1000000);
        double[] copy1mil = duplicator(arr1mil);

        // =========================================
        // ========= 10,000 data points ============
        // =========================================

//        System.out.println("---- 10,000 data points ----");
//        System.out.println();
//        System.out.println("Size of original: " + arr10k.length);
//        System.out.println();
//
//        System.out.println("Size of copy: " + copy10k.length);
//        System.out.println();
//
//        long start10k = System.currentTimeMillis();
//        selectSort(arr10k);
//        long delta10k = System.currentTimeMillis() - start10k;
//
//        System.out.println("Select sort:");
//        System.out.println("Is it actually sorted? " + isSorted(arr10k));
//        System.out.println("Time: " + delta10k + "ms");
//        System.out.println();
//
//        long start10kCopy = System.currentTimeMillis();
//        sort(copy10k, 0, copy10k.length - 1);
//        long delta10kCopy = System.currentTimeMillis() - start10kCopy;
//
//        System.out.println("Merge sort:");
//        System.out.println("Is it actually sorted? " + isSorted(copy10k));
//        System.out.println("Time: " + delta10kCopy + "ms");

        // =========================================
        // ========= 100,000 data points ===========
        // =========================================

//        System.out.println("---- 100,000 data points ----");
//        System.out.println();
//        System.out.println("Size of original: " + arr100k.length);
//        System.out.println();
//
//        System.out.println("Size of copy: " + copy100k.length);
//        System.out.println();
//
//        long start100k = System.currentTimeMillis();
//        selectSort(arr100k);
//        long delta100k = System.currentTimeMillis() - start100k;
//
//        System.out.println("Select sort:");
//        System.out.println("Is it actually sorted? " + isSorted(arr100k));
//        System.out.println("Select sort time: " + delta100k + "ms");
//        System.out.println();
//
//        long start100kCopy = System.currentTimeMillis();
//        sort(copy100k, 0, copy100k.length - 1);
//        long delta100kCopy = System.currentTimeMillis() - start100kCopy;
//
//        System.out.println("Merge sort:");
//        System.out.println("Is it actually sorted? " + isSorted(selectSort(copy100k)));
//        System.out.println("Merge sort time: " + delta100kCopy + "ms");

        // =========================================
        // ========= 1,000,000 data points ===========
        // =========================================

        System.out.println("---- 1,000,000 data points ----");
        System.out.println();
        System.out.println("Size of original: " + arr1mil.length);
        System.out.println();

        System.out.println("Size of copy: " + copy1mil.length);
        System.out.println();

        long start1mil = System.currentTimeMillis();
        selectSort(arr1mil);
        long delta1mil = System.currentTimeMillis() - start1mil;

        System.out.println("Select sort:");
        System.out.println("Is it actually sorted? " + isSorted(arr1mil));
        System.out.println("Select sort time: " + delta1mil + "ms");
        System.out.println();

        long start1milCopy = System.currentTimeMillis();
        sort(copy1mil, 0, copy1mil.length - 1);
        long delta1milCopy = System.currentTimeMillis() - start1milCopy;

        System.out.println("Merge sort:");
        System.out.println("Is it actually sorted? " + isSorted(selectSort(copy1mil)));
        System.out.println("Merge sort time: " + delta1milCopy + "ms");
    }

    public static double[] selectSort(double[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[min]) {
                    min = j;
                }
            }
            double tempStorage = input[i];
            input[i] = input[min];
            input[min] = tempStorage;
        }
        return input;
    }

    public static boolean isSorted(double[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i + 1] < input[i]) {
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

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

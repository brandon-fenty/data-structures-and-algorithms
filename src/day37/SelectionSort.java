package day37;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        double[] arr10k = randomN(10000);
        System.out.println("Size: " + arr10k.length);
        System.out.println(Arrays.toString(arr10k));
    }

    public static double[] randomN(int size) {
        double[] randomData = new double[size];

        for (int i = 0; i < size; i++) {
            Random randVal = new Random();
            randomData[i] = randVal.nextDouble() * 1000;
        }

        return randomData;
    }
}

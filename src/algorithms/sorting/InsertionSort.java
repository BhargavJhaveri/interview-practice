package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] input = { 12, 11, 13, 5, 6 };
        int[] expected = {5, 6, 11, 12, 13 };

        insertionSort(input);
        validateTestCases(input, expected);
    }

    private static void insertionSort(int[] arr) {
        // Think of insertion sort as how we organize playing cards.
        // First element is assumed to be in the correct space.
        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            // Identify the point of insertion.
            // We are at specific index j, so identify point of insertion.
            while(j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            // Update the value at point of interest.
            arr[j+1] = temp;
        }
    }

    private static void validateTestCases(int[] actual, int[] expected) {
        boolean isSame = Arrays.equals(actual, expected);
        System.out.println(Arrays.toString(actual));
        if (isSame) {
            System.out.println("Results are same");
        } else {
            System.err.println("Results are not same");
        }
    }
}

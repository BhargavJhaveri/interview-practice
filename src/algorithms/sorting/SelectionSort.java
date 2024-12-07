package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] data = new int[]{4, 2, 3, 1};
        selectionSort(data);
        int [] expected = new int[] {1, 2, 3, 4};
        validateTestCases(data, expected);
    }

    private static void selectionSort(int[] a) {
        int len = a.length;
        for(int i = 0; i < len; i++) {
            // Objective is to make sure that element at index i, is ith smallest element in the array.
            int minPtr = i;

            //  At this stage, it can be assumed that elements before index i are in their correct final position.
            // So we need to find the ith smallest element
            for(int j = i+1; j < len; j++) {
                if(a[j] < a[minPtr]) {
                    minPtr = j;
                }
            }

            //  We found ith smallest element. But we still need to retain the value that was present at index i.
            // So we swap the value at index i, with other element.
            swap(a, i, minPtr);
        }
    }

    private static void swap(int[] a, int i, int minPtr) {
        int temp = a[i];
        a[i] = a[minPtr];
        a[minPtr] = temp;
    }

    private static void validateTestCases(int[] actual, int[] expected) {
        boolean isSame = Arrays.equals(actual, expected);
        if (isSame) {
            System.out.println("Results are same");
        } else {
            System.err.println("Results are not same");
        }
    }
}

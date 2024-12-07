package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] input = new int[] { 4, 2, 3, 1};
        int [] expected = new int[] {1, 2, 3, 4};
        bubbleSort(input);
        validateTestCases(input, expected);
    }

    private static void bubbleSort(int [] arr) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            for(int j = len-1; j >= i+1; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
            }
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

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

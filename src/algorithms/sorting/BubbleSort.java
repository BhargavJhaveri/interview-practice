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
        /*
            Bubble sort is derived from the concept that, after each iteration - i,
            the ith smallest element bubbles to its correct final position in the array.

            To visualize this algorithm for code perspective,
            take a random index j in the array and think from that perspective.
            1. Start from right to left with pointer ptr.
            2. Compare ptr to its neighbor and if value at index ptr is lesser, it means,
                it is not in the correct place. It should be swapped.
            3. Since after each ith iteration, array from  index 0 to ith is in sorted order,
                there is no need to compare beyond i+1.
                So we can keep search space from len-1 to i+1 index.
            4. This is an in-place algorithm.
                Time complexity is O(n^2), Space complexity is O(1)
         */
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

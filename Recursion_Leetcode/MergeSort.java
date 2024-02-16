package recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 22, 1, 75, 41};
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void divide(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            divide(arr, start, mid);
            divide(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
    static void merge(int[] arr, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        int index = 0;
        int[] temp = new int[end - start + 1];  // Correctly initialize the temp array

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right])
                temp[index++] = arr[left++];
            else
                temp[index++] = arr[right++];


        }

        // Copy remaining elements from the left subarray
        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        // Copy remaining elements from the right subarray
        while (right <= end) {
            temp[index++] = arr[right++];
        }

        // Copy elements from the temp array back to the original array
        for (int i = 0, j = start; i < temp.length; i++, j++) {
            arr[j] = temp[i];
        }
    }
}

package array_leetcode;

import java.util.Arrays;
//Dutch National Flag problem
public class leetcode75 {
    public static void main ( String[] args ) {
        int arr[]={2,0,2,1,1,0};
        sortColors ( arr );
        System.out.println ( Arrays.toString ( arr) );
    }
    static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;     //6
        int current = 0;

        while (current <= high) {
            if (nums[current] == 0) {
                swap(nums, low, current);
                low++;
                current++;
            } else if (nums[current] == 2) {
                swap(nums, current, high);
                high--;
            } else {
                current++;
            }
        }
    }

    static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}

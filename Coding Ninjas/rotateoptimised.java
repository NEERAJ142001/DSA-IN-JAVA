package Ninjas;

import java.util.Arrays;

public class rotateoptimised {
    public static void main ( String[] args ) {
        int[] arr={1,2,3,4,5,6,7};
         rotate ( arr,3 ) ;
        System.out.println ( Arrays.toString(arr));
    }
    static void rotate(int[] arr,int k){
        int n= arr.length;
        k=k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
    static void reverse(int[] nums,int start,int end){
        while (start < end) {
            int temp = nums[ start ];
            nums[ start ] = nums[ end ];
            nums[ end ] = temp;
            start++;
            end--;
        }
    }
}

package Leetcode_Searching;

public class leetcode33 {
    public static void main ( String[] args ) {
        int num[] = {4,7,0,1,2};
        System.out.println (search ( num,2 ) );
        System.out.println (pivot ( num ) );
    }

    static int search ( int[] nums , int target ) {
        int center=pivot ( nums );
        if (nums[center]==target)
            return center;
        if (target >= nums[0] )
            return binarysearch ( nums,target,0,center );
        else
            return binarysearch ( nums,target,center+1,nums.length-1);
    }

    static int pivot ( int[] num ) {
        int start = 0;
        int end = num.length - 1;
        int mid = 0;
        while ( start < end ) {
            mid = start + ( end - start ) / 2;
            if ( num[ mid ] > num[ mid + 1 ] )
                return mid;
            else if ( num[ mid ] < num[ 0 ] ) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static  int binarysearch ( int[] num , int target,int start, int end){

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

package Leetcode_Searching;

public class leetcode153 {
    public static void main ( String[] args ) {
        int arr[]={4,5,6,7,0,1,2};
//        int arr[]={11,13,15,17};
        System.out.println (pivot ( arr ) );
        System.out.println (findMin ( arr ) );

    }
    static int findMin ( int[] nums ) {
        int center=pivot ( nums );
        if ( center== nums.length-1 )
            return nums[0];
        else
            return nums[center+1];
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
        return start == end ? start : -1;
    }

}

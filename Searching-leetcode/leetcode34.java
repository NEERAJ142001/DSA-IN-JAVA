package Leetcode_Searching;

import java.util.Arrays;

public class leetcode34 {
    public static void main ( String[] args ) {
        int nums[] = {5, 5 , 7 , 7 , 8 , 8 , 10 , 10 };
        System.out.println ( Arrays.toString (  searchRange ( nums , 5 ) ) );
    }

    static int[] searchRange ( int[] nums , int target ) {
        int start = 0;
        int end = nums.length - 1;
        int first = index ( nums , start , end , target , true );
        int last = index ( nums , start , end , target , false );
        return new int[]{ first , last };
    }

    static int index ( int[] nums , int start , int end , int target , boolean b ) {
        int mid = start + ( end - start ) / 2;
        int ans = - 1;
        while ( start <= end ) {
            if ( nums[ mid ] == target ) {
                ans = mid;
                if ( b == true ) {

                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else if ( target > nums[ mid ] )
                start = mid + 1;
            else
                end = mid - 1;

            mid = start + ( end - start ) / 2;
        }
        return ans;
    }
}

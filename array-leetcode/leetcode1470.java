package array_leetcode;

import java.util.Arrays;

public class leetcode1470 {
    public static void main ( String[] args ) {
        int a[] = { 2 , 5 , 1 , 3 , 4 , 7 };

        System.out.println ( Arrays.toString ( shuffle ( a , 3 ) ) );
    }

    static int[] shuffle ( int[] nums , int n ) {
        int ans[] = new int[ nums.length ];
        // [2,5,1,3,4,7]
        // x1=2, x2=5, x3=1, y1=3, y2=4, y3=7
        // [2,3,5,4,1,7]
        int counter = 0;
        for ( int i = 0 ; i < n ; i++ ) {
            int x = nums[ i ];
//            System.out.println ( "values of x " + x );
            int y = nums[ i + n ];
//            System.out.println ( "values of y " + y );
            ans[ counter ] = x;
            ans[ counter + 1 ] = y;
            counter = counter + 2;
//            System.out.println ( counter );
        }
        return ans;
    }
}

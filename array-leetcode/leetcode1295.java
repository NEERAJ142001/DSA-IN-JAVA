package array_leetcode;

public class leetcode1295 {
    public static void main ( String[] args ) {
        int num[] = { 12 , 345 , 2 , 6 , 7896 };
        System.out.println ( findNumbers ( num ) );
    }

    static int findNumbers ( int[] nums ) {
        int result = 0;
        for ( int i = 0 ; i < nums.length ; i++ ) {
            int x = nums[ i ];
            if ( x < 0 )
                x = x * - 1;
            if ( even ( x ) )
                result++;

        }
        return result;
    }

    static boolean even ( int n ) {
        int count = 0;

        count = ( int ) (Math.log10 ( n ) + 1);
        return count % 2 == 0;
    }
}

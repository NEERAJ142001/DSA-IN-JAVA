package array_leetcode;

public class leetcode1672 {
    public static void main ( String[] args ) {
        int arr[][] = { { 1 , 2 , 3 } , { 3 , 2 , 1 } };
        System.out.println ( maximumWealth ( arr ) );
    }

    static int maximumWealth ( int[][] accounts ) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for ( int i = 0 ; i < accounts.length ; i++ ) {
            for ( int j = 0 ; j < accounts[ i ].length ; j++ ) {
                sum = sum + accounts[ i ][ j ];
            }
            if ( sum > max )
                max = sum;
            sum = 0;
        }
        return max;
    }
}

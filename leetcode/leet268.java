package leetcode;

public class leet268 {
    public static void main ( String[] args ) {
        int arr[] = { 5, 2, 1, 3, 0 };
        System.out.println ( missingNumber ( arr ) );
    }

    static int missingNumber ( int[] nums ) {
        int i = 0;
        while (i < nums.length) {
            int correct_index = nums[ i ];
            if ( nums[ i ] < nums.length && nums[ i ] != nums[ correct_index ] )
                ssw ( nums, i, correct_index );
            else
                i++;
        }
        for ( int in = 0 ; in < nums.length ; in++ ) {
            if ( nums[ in ] != in )
                return in;
        }
        return nums.length;
    }

    static void ssw ( int[] arr, int first, int second ) {
        int temp = arr[ first ];
        arr[ first ] = arr[ second ];
        arr[ second ] = temp;
    }
}

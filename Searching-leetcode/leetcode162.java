package Leetcode_Searching;

public class leetcode162 {
    public static void main ( String[] args ) {
        int num[]={1,2,3,1};
        System.out.println (findPeakElement ( num ) );
    }
    static int findPeakElement(int[] num) {
        int start = 0;
        int end = num.length - 1;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if ( num[mid] > num[mid + 1])
                end=mid;
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}

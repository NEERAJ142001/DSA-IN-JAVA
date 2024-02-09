package array_leetcode;

public class leetcode1732 {
    public static void main ( String[] args ) {
        int arr[]={-4,-3,-2,-1,4,3,2};
        System.out.println (largestAltitude ( arr ) );
    }
    static  int largestAltitude(int[] gain){
        int max_sum=0;
        int current_sum=0;
        for ( int i=0;i<gain.length;i++ ){
            current_sum=current_sum+gain[i];
            if ( current_sum > max_sum  ){
                max_sum=current_sum;
            }
        }
        return max_sum;
    }
}

package array_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class leetcode1431 {
    public static void main ( String[] args ) {
        int arr[]={2,3,5,1,3};
        List<Boolean> ans=new ArrayList<> (arr.length);
        ans=kidsWithCandies ( arr,3 );
        System.out.println (ans );
    }
    static List<Boolean> kidsWithCandies ( int[] candies, int extraCandies ) {
        List<Boolean> ans=new ArrayList<> (candies.length);
        int max=0;
        for ( int i=0;i<candies.length;i++ ){

            if ( candies[i]>max ){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int sum=candies[i]+extraCandies;
            if ( sum>=max ){
                ans.add ( true );
            }
            else {
                ans.add ( false );
            }
        }
        return ans;
    }
}

package Recursion_leetcode;

import java.util.Arrays;

public class Reverse_array {
    public static void main ( String[] args ) {
        System.out.println ( Arrays.toString ( reverseArray ( 5, new int[]{ 1 , 2 , 3 , 4 , 5 } ) ) );
//        System.out.println ( Arrays.toString ( reverse ( 5-1, new int[]{ 1 , 2 , 3 , 4 , 5 },0 ) ) );
    }
    static int[] reverseArray(int n, int []nums) {
        int[] ans=new int[n];
        return helper ( n-1,nums,ans,0 );

    }
    static int[] helper(int n,int arr[],int[] answer,int start){
        if ( n<0)
            return answer;
        answer[start]=arr[n];
        return helper ( n-1,arr,answer,start+1 );
    }
}


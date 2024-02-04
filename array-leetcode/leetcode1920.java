package array_leetcode;

import java.util.Arrays;

public class leetcode1920 {
    public static void main ( String[] args ) {
        int arr[]={0,2,1,5,3,4};

        int answer[]=buildArray ( arr );
        System.out.println ( Arrays.toString ( answer ) );

    }
    static  int[] buildArray(int[] nums) {
        int answer[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[nums[i]];
        }
        return answer;
    }
}

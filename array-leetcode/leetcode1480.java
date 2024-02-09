package array_leetcode;

import java.util.Arrays;

public class leetcode1480 {
    public static void main ( String[] args ) {
        int arr[]={1,2,3,4};
        System.out.println ( Arrays.toString ( runningSum ( arr ) ) );
    }
    static int[] runningSum(int[] nums) {
        int answer[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            answer[i]=sum;
        }
        return answer;
    }
}

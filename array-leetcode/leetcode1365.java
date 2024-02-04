package array_leetcode;

import java.util.Arrays;

public class leetcode1365 {
    public static void main ( String[] args ) {
        int arr[]={8,1,2,2,3};
        System.out.println ( Arrays.toString ( smallerNumbersThanCurrent ( arr ) ) );
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}

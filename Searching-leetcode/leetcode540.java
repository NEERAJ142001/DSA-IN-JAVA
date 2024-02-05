package Leetcode_Searching;

public class leetcode540 {
    public static void main ( String[] args ) {
        int num[]={1,1,2,3,3,4,4,8,8};
        System.out.println (singleNonDuplicate ( num ) );
    }
    static int singleNonDuplicate(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}

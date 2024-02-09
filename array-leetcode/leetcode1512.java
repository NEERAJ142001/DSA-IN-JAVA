package array_leetcode;

import java.util.Arrays;

public class leetcode1512 {
    public static void main ( String[] args ) {
        int nums[]={1,2,3,1,1,3};
        System.out.println ( (  numIdenticalPairs ( nums )) );
        System.out.println (brute ( nums ) );
    }
    static int brute(int[] nums){
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
//                    System.out.println (nums[i] +" "+ nums[j]);
                    count++;
                }
            }
        }
        return count;
    }
    static int numIdenticalPairs(int[] nums) {

        int fre[]=new int[101];
        for(int i=0;i<nums.length;i++) {
            fre[nums[i]]++;
        }
        int goodPairsCount = 0;

        // Calculate good pairs
        for (int i = 0; i < fre.length; i++) {
            if (fre[i] > 1) {
                goodPairsCount += fre[i] * (fre[i] - 1) / 2;
            }
        }
            return goodPairsCount;
        }
}

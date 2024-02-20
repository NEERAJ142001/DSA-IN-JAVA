package array_leetcode;

public class lettcode485 {
    public static void main ( String[] args ) {
        System.out.println (findMaxConsecutiveOnes ( new int[]{1,1,0,1} ) );
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if ( nums[i]==1 ){
                count++;
            }
            else {
                count=0;
            }
            if ( count>max )
                max=count;
        }
        return max;
    }
}

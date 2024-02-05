package array_leetcode;

public class leetcode53 {
    public static void main ( String[] args ) {
        int num[]={5,4,-1,7,8};
        System.out.println (maxSubArray ( num ) );
    }
    static int maxSubArray(int[] nums) {
        int sum = nums[ 0 ];
        int max_sum = nums[ 0 ];

        for (int i = 1; i < nums.length; i++) {
            if (sum >= 0) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }

            if (sum > max_sum) {
                max_sum = sum;
            }
        }
        return max_sum;
    }
}

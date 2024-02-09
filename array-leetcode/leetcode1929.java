package array_leetcode;

import java.util.Arrays;

public class leetcode1929 {
    public static void main ( String[] args ) {
        int arr[]={1,3,2,1};
        int ans[]=getConcatenation ( arr );
        System.out.println ( Arrays.toString ( ans ) );
    }
    static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int answer[] = new int[len * 2];
        for (int i = 0; i < len; i++) {

            answer[i] = nums[i];
            answer[len + i] = nums[i];

        }
        return answer;
    }
}

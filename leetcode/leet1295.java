package leetcode;

public class leet1295 {
    public static void main(String[] args) {
        int[] nums = {12, 3454, 2, 6, 7986, 52525};
        int result = findNumbers(nums);
        System.out.println(result);
    }

    static boolean even(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;

        }
        if (count % 2 == 0)
            return true;
        else
            return false;
    }

    static int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (even(x))
                result++;
        }
        return result;
    }
}

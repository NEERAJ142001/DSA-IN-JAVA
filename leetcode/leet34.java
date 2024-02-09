package leetcode;

import java.util.Arrays;

public class leet34 {
    public static void main(String[] args) {
    int[] nums = {5,7,7,8,8,10};
    int[] ans;
    ans =searchRange(nums,10);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
       int start=0;
       int end=nums.length-1;
       int x= index(nums,start,end,target,true);
        int y= index(nums,start,end,target,false);
//       int y=last(nums,start,end,target,false);
       return new int[]{x,y};

    }
    static int index(int [] nums, int start, int end, int target, boolean b){
        int mid=start+(end-start)/2;
        int ans=-1;
        while (start<=end ){
            if(nums[mid]==target) {
                ans = mid;
                if (b==true){

                    end = mid - 1;
                }
                else {
                    start=mid+1;
                }

            }
            else if (target>nums[mid])
                start=mid+1;
            else
                end=mid-1;

            mid=start+(end-start)/2;
        }
        return ans;
    }
//    static  int last(int [] nums, int start, int end, int target, boolean b){
//        int ans=-1;
//        int mid=start+(end-start)/2;
//        while (start<=end) {
//            if (nums[mid] == target) {
//            ans = mid;
//            start = mid + 1;
//        }
//            else if (target>nums[mid])
//                start=mid+1;
//            else
//                end=mid-1;
//            mid=start+(end-start)/2;
//        }
//        return ans;
//    }
}

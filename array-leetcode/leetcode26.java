package array_leetcode;

public class leetcode26 {
    public static void main ( String[] args ) {
    int num[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println (removeDuplicates ( num ) );
    }
    static int removeDuplicates(int[] nums){
        if (nums.length == 0) {
            return 0;
        }
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[index]){
                index++;
                nums[index]=nums[i];
            }
        }
        return index+1;
    }

}

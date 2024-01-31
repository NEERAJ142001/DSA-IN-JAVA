package leetcode;

public class leet852 {
    public static void main(String[] args) {
        int [] arr={0,3,8,9,10,11,8,5,2,1,-10};
        int answer=peakIndexInMountainArray(arr);
        System.out.println(answer);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1])
                end=mid;
            else
                start=mid+1;
        }
        return start;
    }

}

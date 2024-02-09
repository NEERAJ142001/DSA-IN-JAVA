package leetcode;

public class leet1095 {
    public static void main(String[] args) {
        int []arr={10,15,17,19,23,27,23,10,1};
        int key=23;
        int peek=peek( arr );
        int first=first(arr,key,0, peek);
        int second=second(arr,key, peek+1, arr.length-1 );
        if ( first < second )
            System.out.println( first );
        else
            System.out.println( second );
    }
    static int first(int arr[],int target,int start,int end ){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if (target>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    static int second(int arr[],int target,int start,int end ){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if (target<arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    static int peek(int arr[]){
        int start=0;
        int end =arr.length-1;
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

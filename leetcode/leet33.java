package leetcode;

public class leet33 {
    public static void main(String[] args) {
        int [] arr={6,8};
        int target=6;
//        System.out.println(search(arr,target));
        int mid=pivot(arr);
        System.out.println(mid);
        int left=search( arr,target,0,mid);
//        System.out.println(left);
//        if ( left ==-1 )
        System.out.println("left"+left);
        System.out.println("right"+search( arr,target,mid+1, arr.length-1 ));
//        else
//            System.out.println(left);
    }
    static int pivot(int[] arr){
        int start=0;
        int end =arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
                return mid;
            if(mid>start && arr[mid]<arr[mid-1])
                return mid-1;
            else if(arr[mid]<=arr[start])
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
    static int search(int[] arr,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target)
                return mid;
            else if (target>arr[mid])
                end=mid;
            else
                start=mid+1;
        }
        return -1;
    }
}

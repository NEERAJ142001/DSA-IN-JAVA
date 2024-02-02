package binarySearch;

public class search_insert_position {
    public static void main ( String[] args ) {
        int arr[]={1,3,5,6};
        System.out.println (search ( arr,7));

    }
    static int search(int arr[],int target){

        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if ( arr[mid] !=target){
                if (target>arr[mid])
                    start=mid+1;
                else if ( target<arr[mid] )
                    end=mid-1;
                else
                    return mid;
            }
            else if ( arr[mid]==target )
                return mid;
        }
        return start;
    }
}

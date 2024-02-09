package array;

import java.util.Arrays;

public class InsertionSSort {
    public static void main ( String[] args ) {
        int arr[]={10,2,96,21,52};
        selectionSort ( arr );
        System.out.println ( Arrays.toString( arr));
    }
    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;  //5-1-0=4
            int maxIndex=max(arr,0,last); //arr,0,4
            swap(arr, maxIndex, last);    //arr,
        }
    }
    static int max(int arr[],int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){   //0,4
            if(arr[i]>arr[max])
                max=i;
        }
        return max;
    }
    static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}

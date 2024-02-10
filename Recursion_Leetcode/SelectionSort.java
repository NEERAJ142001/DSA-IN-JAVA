package Recursion_leetcode;

import java.util.Arrays;

import static java.lang.Integer.MIN_VALUE;

public class SelectionSort {
    public static void main ( String[] args ) {
        int arr[]={5,4,3,2,1};
        sort ( arr, arr.length,0,0);
        System.out.println ( Arrays.toString ( arr ) );

    }
    static void sort(int arr[],int i,int j,int max){
        if ( i==0 )
            return;
        if ( j<i ){
            if ( arr[j]>arr[max] )
                sort ( arr,i,j+1 ,j);
            else
                sort ( arr,i,j+1,max );
        }
        else {
            int temp=arr[max];
            arr[max]=arr[i-1];
            arr[i-1]=temp;
            sort ( arr,i-1,0 ,0);
        }
    }
}

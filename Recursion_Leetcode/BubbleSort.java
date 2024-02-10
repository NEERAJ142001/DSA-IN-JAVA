package Recursion_leetcode;

import java.util.Arrays;

public class BubbleSort {
    public static void main ( String[] args ) {
        int arr[]={5,4,3,2,1};
        sort ( arr, arr.length-1 , 0 );
        System.out.println ( Arrays.toString ( arr ) );
    }
    static void sort(int arr[],int i,int j){
        if ( i==0 )
            return;
        if ( j<i ){  //0<4
            if ( arr[j]>arr[ j+1 ] ){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            sort ( arr,i,j+1 );
        }
        sort ( arr,i-1,0 );
    }
}

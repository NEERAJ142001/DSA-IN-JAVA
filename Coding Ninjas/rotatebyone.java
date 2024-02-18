package Ninjas;

import java.util.Arrays;

public class rotatebyone {
    public static void main ( String[] args ) {
        int[] arr={1,2,3,4,5};
        System.out.println ( Arrays.toString ( rotateArray ( arr, arr.length ) ) );
    }
    static int[] rotateArray(int[] arr, int n) {
        for(int i=1;i<arr.length;i++){
            int temp=arr[i-1];
            arr[i-1]=arr[i];
            arr[i]=temp;
        }
        return arr;

    }
}

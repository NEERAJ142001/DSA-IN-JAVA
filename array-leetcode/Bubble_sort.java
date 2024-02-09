package array;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[]={574,4,84,-45,-44,0,44};
        search( arr );
        System.out.println( Arrays.toString( arr ) );
    }
    static void search(int arr[]){

        for (int i=0;i< arr.length;i++){
            boolean flag=true;
            for (int j=1;j< arr.length-i;j++){
                if ( arr[j-1]>arr[j]){
                    int temp=arr[ j-1 ];
                    arr[j-1]=arr[ j ];
                    arr[j]=temp;
                    flag=false;
                }
            }
            if ( flag==true )
                break;
        }
    }
}

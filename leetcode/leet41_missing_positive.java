package array;

public class leet41_missing_positive {
    public static void main ( String[] args ) {
        int arr[]={7,8,9,11,12};
        System.out.println (positive ( arr ));
    }
    static  int positive(int arr[]){

        int i=0;
        while (i< arr.length){
            int ci=arr[i]-1;
            if( arr[i] > 0 && arr[i] <= arr.length && arr[i]!=arr[ci]){
                int temp=arr[i];
                arr[i]=arr[ci];
                arr[ci]=temp;
            }
            else {
                i++;
            }
        }
        for (int k=0;k<arr.length;k++ ){
            if ( arr[k]!= k+1 ){
                return k+1;
            }
        }
        return arr.length+1;
    }
}

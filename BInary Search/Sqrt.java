package binarySearch;

public class Sqrt {
    public static void main ( String[] args ) {
        System.out.println (output(2147395599));
    }
    static int output(int n){
        long start=0;
        long end=n;
        if ( n==0 ||n==1 )
            return n;
        while(start<=end){
            long mid=start+(end-start)/2;
            if ( mid*mid==n)
                return (int)mid;
            else if ( mid*mid>n )
                end=mid-1;
            else
                start=mid+1;
        }
        return (int)start-1;
    }
}

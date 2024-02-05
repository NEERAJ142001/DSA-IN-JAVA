package array_leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class leetcode989 {
    public static void main ( String[] args ) {
        int num[] = { 1 , 2 , 0 , 0 };
        System.out.println ( addToArrayForm ( num , 50 ) );
    }
    static List<Integer> addToArrayForm ( int[] num , int k ) {
        List<Integer> x = new ArrayList<> ( );
        int index= num.length-1;
        int carry=0;
        while ( index>=0 ||k>0 || carry>0 ){
            int value=index>=0?num[index]:0;
            int k_value=k%10;
            int sum=value+k_value+carry;
            x.add ( sum%10 );
            carry=sum/10;
            index--;
            k/=10;
        }
        Collections.reverse ( x);
        return x;

    }
}

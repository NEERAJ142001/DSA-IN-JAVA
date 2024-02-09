package Recursion_leetcode;

import java.util.ArrayList;
import java.util.List;

public class Factorial_Numbers_Not_Greater_Than_N {
    public static void main ( String[] args ) {
        System.out.println (factorialNumbers ( 101466824 ) );
//        System.out.println (fact ( 3 ) );

    }
    static List <Long> factorialNumbers ( long n ) {
        List<Long> x=new ArrayList <> ();
        int i=1;
        long factorial=fact ( i );
        while ( factorial<=n ){
            x.add ( factorial );
            i++;
            factorial=fact ( i );
        }
        return x;
    }
    static long fact(int n){
        if ( n==1 )
            return 1;
        return n* fact ( n-1 );
    }
}

package Ninjas;

import java.util.ArrayList;
import java.util.List;

public class Union {
    public static void main ( String[] args ) {
    int[] a={1,2,3,4,6};
    int[] b={2,3,5};
        System.out.println (sortedArray ( a,b ) );
    }
    static List < Integer > sortedArray ( int []a, int []b ) {
        ArrayList<Integer> x=new ArrayList <> (  );
        for ( int i=0;i<a.length;i++ ){
            if ( !x.contains ( a[i] ) ){
                x.add ( a[ i ]  );
            }
        }
        for ( int i=0;i<b.length;i++ ){
            if ( !x.contains ( b[i] ) ){
                x.add ( b[ i ]  );
            }
        }
        return x;
    }
}

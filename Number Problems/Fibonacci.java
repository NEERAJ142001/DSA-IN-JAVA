package numbers;

import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args) {

        Scanner sc = new Scanner ( System.in );
        System.out.println ( "input length" );
        int n = sc.nextInt ( );
        int a = 0;
        int b = 1;
        int c = 0;
        int temp;
        if ( n == 1 )
            System.out.println ( a );
        if ( n == 2 )
            System.out.println ( b );
        for ( int i = 2 ; i < n ; i++ ) {
            c = a + b;
            temp = c;
            a = b;
            b = temp;
        }
        System.out.print ( c );

    }
}

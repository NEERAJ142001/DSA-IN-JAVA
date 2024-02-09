package Recursion_leetcode;

public class leetcode125 {
    public static void main ( String[] args ) {
        System.out.println ( isPalindrome ( "0P" ) );
    }

    static boolean isPalindrome ( String s ) {
        s = s.toLowerCase ( );
        String modified = "";
        for ( int i = 0 ; i < s.length ( ) ; i++ ) {
            char ch = s.charAt ( i );
            if ( Character.isLetter(ch) ) {
                modified = modified + ch;
            }
        }
        return pal ( modified , 0 , modified.length ( ) - 1 );
    }
    static boolean pal ( String s , int start , int end ) {
        if ( start > end )
            return true;
        if ( start < end && s.charAt ( start ) != s.charAt ( end ) )
            return false;
        return pal ( s , start + 1 , end - 1 );
    }
}

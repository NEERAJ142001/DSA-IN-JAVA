package patterns;

public class Pattern {
    public static void main ( String[] args ) {
//        pattern1 ( 5 );
//        pattern2 ( 5 );
//        pattern3 ( 5 );
//        pattern4 ( 5 );
//        pattern5 ( 5 );
//        pattern6 ( 5 );
//        pattern7 ( 5 );
//        pattern8 ( 5 );
//        pattern9 ( 5 );
//        pattern10 ( 5 );
//        pattern11 ( 5 );
//        pattern12 ( 5 );
//        pattern13 ( 5 );
//        pattern14 ( 5 );
//        pattern15 ( 5 );
//        pattern16 ( 5 );
//        pattern17 ( 5 );
//        pattern18 ( 5 );
//        pattern19 ( 5 );
//        pattern20 ( 5 );
//        pattern21 ( 6 );
        pattern22 ( 4 );

    }

    static void pattern1 ( int n ) {
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                System.out.print ( "* " );
            }
            System.out.println ( );
        }
    }

    static void pattern2 ( int n ) {
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j <= i ; j++ ) {
                System.out.print ( "* " );
            }
            System.out.println ( );
        }
    }

    static void pattern3 ( int n ) {
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j <= i ; j++ ) {
                System.out.print ( j + 1 + " " );
            }
            System.out.println ( );
        }
    }

    static void pattern4 ( int n ) {
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j <= i ; j++ ) {
                System.out.print ( i + 1 + " " );
            }
            System.out.println ( );
        }
    }

    static void pattern5 ( int n ) {
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = n - 1 ; j >= i ; j-- ) {
                System.out.print ( "* " );
            }
            System.out.println ( );
        }
    }
    static void pattern6(int n){
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 1 ; j <=n-i ; j++ ) {
                System.out.print ( j+" " );
            }
            System.out.println ( );
        }
    }
    static void pattern7(int n){
        for ( int i = 1 ; i <= n ; i++ ) {
            int space=n-i;
            for ( int s = 0 ; s < space ; s++ ) {
                System.out.print (" ");
            }
            for ( int j = 1 ; j <= i*2-1 ; j++ ) {
                System.out.print ("*");
            }
            System.out.println ( );
        }
    }
    static void pattern8(int n){
        for ( int i = n ; i > 0 ; i-- ) {
            int space=n-i;
            for ( int s = 0 ; s < space ; s++ ) {
                System.out.print (" ");
            }
            for ( int j = 1 ; j <= i*2-1 ; j++ ) {
                System.out.print ("*");
            }
            System.out.println ( );
        }
    }
    static void pattern9(int n){
        for ( int i = 1 ; i <= n*2 ; i++ ) {
            int space=i<=n?n-i:i-n-1;
            for ( int s = 0 ; s < space ; s++ ) {
                System.out.print (" ");
            }
            int stars=i<=n?i*2-1:(n*2)-(((i-n)*2)-1);
            for ( int j = 1 ; j <= stars ; j++ ) {
                System.out.print ("*");
            }
            System.out.println ( );
        }
    }
    static void pattern10(int n){
        for ( int i = 1 ; i <= 2*n-1; i++ ) {
            int stars=i<=n?i:n-(i-n);
            for ( int col = 0 ; col < stars ; col++ ) {
                System.out.print ("* " );
            }
            System.out.println ( );
        }
    }
    static void pattern11(int n){
        for ( int i = 1 ; i <=n ; i++ ) {
            for ( int j=1;j<=i;j++ ){
                if ( i%2!=0 ){
                    if ( j%2==0 )
                        System.out.print ("0 " );
                    else
                        System.out.print ("1 " );
                }
                else {
                    if ( j%2==0 )
                        System.out.print ("1 " );
                    else
                        System.out.print ("0 " );
                }
            }
            System.out.println ( );
        }
    }
    static void pattern12(int n){
        for ( int i=1;i<n;i++ ){
            for ( int j = 1 ; j <= i ; j++ ) {
                System.out.print (j );
            }
            for ( int space=1;space<(n-i-1)*2;space++ ){
                System.out.print (" " );
            }
            for ( int j = i ; j > 0 ; j-- ) {
                System.out.print (j );
            }
            System.out.println ( );
        }
    }
    static void pattern13(int n){
        int updater=1;
        for ( int i=1;i<=n;i++ ){
            for ( int j = 1 ; j <= i ; j++ ) {
                System.out.print ( updater++ +" ");
            }
            System.out.println ( );
        }
    }
    static void pattern14(int n){
        for ( int i=0;i<n;i++){
            for ( int j=65;j<=65+i;j++){
                System.out.print ((char)j +" ");
            }
            System.out.println ( );
        }
    }
    static void pattern15(int n){
        for ( int i=0;i<n;i++){
            for ( int j=65;j<=65+n-i-1;j++){
                System.out.print ((char)j +" ");
            }
            System.out.println ( );
        }
    }
    static void pattern16(int n){
        for ( int i=0;i<n;i++){
            for ( int j=0;j<=i;j++){
                int sum=65+i;
                System.out.print ((char)sum +" ");
            }
            System.out.println ( );
        }
    }
    static void pattern17(int n){
        for ( int i=1;i<n;i++){
            for ( int s=0;s<n-i;s++ ){
                System.out.print (" " );
            }
            for ( int j=1;j<=i;j++){
//                int pp=65+j-1;
                System.out.print (j);
            }
            for ( int opp=i-1;opp>0;opp--){
//                int nn=65+opp-1;
                System.out.print (opp);
            }
            System.out.println ( );
        }
    }
    static void pattern18(int n){
        for ( int i=1;i<=n;i++ ){
            for ( int j=1;j<=i;j++ ){
//                int num=n-i+j;
//                System.out.print (num +" ");
                int num=65+n+j-i-1;
                System.out.print ((char)num+" " );
            }
            System.out.println ( );
        }
    }
    static void pattern19(int n){
        for ( int i=1;i<n*2;i++ ){
            int stars=i<=n?n-i+1: i-n;
            for ( int st=1;st<=stars;st++){
                System.out.print ("* " );
            }
            int spaces=i<=n?2*i-2:(n*2)-(i-n)*2;
            for ( int sp=1;sp<=spaces;sp++){
                System.out.print ("  ");
            }
//            int rightStars=i<=n?n-i+1: i-n;
            for ( int last=1;last<=stars;last++){
                System.out.print ("* " );
            }
            System.out.println ( );
        }
    }
    static void pattern20(int n){
        for ( int i = 1 ; i <= n*2-1 ; i++ ) {
            int stars =i<=n?i:n*2-i;
            for ( int st=1;st<=stars;st++){
                System.out.print ("* " );
            }
            int spaces=i<=n?n*2-i*2:(i-n)*2;
            for ( int sp=1;sp<=spaces;sp++ ){
                System.out.print ("  " );
            }
            for ( int last=1;last<=stars;last++ ){
                System.out.print ("* " );
            }
            System.out.println ( );
        }
    }
//    static void pattern21(int n){
//        for ( int i=1;i<n*2;i++ ){
//            if ( i==1 && i==(n*2)-1 ){
//                for(int j=1;j<n;j++){
//                    System.out.print ("* " );
//                }
//            } else if ( i%2==0) {
//                for(int sp=1;sp<n;sp++){
//                    System.out.print (" ");
//                }
//            }
//            else {
//                for ( int onestar=1;onestar<n;onestar++){
//                    if ( onestar==1 && onestar==n-1 ){
//                        System.out.print ("* ");
//                    }
//                }
//            }
//            System.out.println ( );
//        }
//    }
static void pattern21(int n) {
    for (int i = 1; i <= n * 2-1; i++) {
        if (i == 1 || i == n * 2-1) {
            for (int j = 1; j < n; j++) {
                System.out.print("*");
            }
        } else if (i % 2 == 0) {
            for (int sp = 1; sp < n; sp++) {
                System.out.print(" ");
            }
        }
        else if (i % 2 != 0){
            for ( int onestar=1;onestar<n;onestar++){
                    if ( onestar==1 || onestar==n-1 )
                        System.out.print ("*");
                    else
                        System.out.print (" ");
                }
            }
        System.out.println();
    }
}
//                int top=col;
//                int bottom=n-col;
//                int left=row;
//                int right=n-row;
static void pattern22(int n){
        int len=n;
    n = 2 * n;
    for (int row = 0; row <= n; row++) {
        for (int col = 0; col <= n; col++) {
            int atEveryIndex = len- Math.min(Math.min(row, col), Math.min(n - row, n - col));
            System.out.print(atEveryIndex + " ");
        }
        System.out.println();
    }
}

}

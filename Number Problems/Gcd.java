package numbers;

public class Gcd {
    public static void main ( String[] args ) {
        System.out.println (calcGCD ( 50,15 ) );
    }
    static int calcGCD(int n, int m){
        if(n==0)
            return m;

        return calcGCD(m%n, n);
    }
}

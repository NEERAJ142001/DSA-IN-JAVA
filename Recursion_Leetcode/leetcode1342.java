package Recursion_leetcode;

public class leetcode1342 {
    public static void main (String[] args) {
        System.out.println (numberOfSteps ( 524 ) );
    }
    static int numberOfSteps(int num) {
        int counter=0;
        return count(num,counter);
    }
    static int count(int n,int count){
        if(n==0)
            return count;

        if(n%2==0)
            return count(n/2,count+1);
        return count(n-1,count+1);
    }
}

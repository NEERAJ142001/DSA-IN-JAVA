package array_leetcode;

public class leetcode1572 {
    public static void main ( String[] args ) {
    int mat[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
        System.out.println (diagonalSum ( mat ) );
    }
   static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j)
                    sum=sum+mat[i][j];
                else if(i+j==mat.length-1){
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;
    }
}

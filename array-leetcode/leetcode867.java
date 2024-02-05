package array_leetcode;

import java.util.Arrays;

public class leetcode867 {
    public static void main ( String[] args ) {
        int matrix[][]= {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println ( Arrays.deepToString ( transpose ( matrix )) );
    }
    static int[][] transpose(int[][] matrix){
        int n=matrix[0].length;
        int m=matrix.length;
        int[][] result = new int[n][m];
        for ( int i=0;i<m;i++ ){
            for ( int j=0;j<n;j++ ){
                result [j][i]=matrix[i][j];
            }
        }
        return result;
    }
}

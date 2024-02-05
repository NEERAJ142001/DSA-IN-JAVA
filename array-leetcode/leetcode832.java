
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for ( int a = 0 ; a < image.length ; a++ ) {
            int start=0;
            int end=image[a].length-1;
            while (start<end){
                int temp=image[a][start];
                image[a][start]=image[a][end];
                image[a][end]=temp;
                start++;
                end--;
            }
            for (int i = 0; i < image[a].length; i++) {
               image[a][i] ^= 1;
            }
        }
        return image;
    }
}

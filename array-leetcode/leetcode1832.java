package array_leetcode;

public class leetcode1832 {
    public static void main ( String[] args ) {
        String st="leetcode";
//        System.out.println (checkIfPangram ( st ) );
        System.out.println (optimize ( st ) );
    }
    static boolean checkIfPangram(String sentence) {
        for ( int j=97;j<=122;j++ ){
            int flag=0;
            for(int i=0;i<sentence.length();i++){
                char ch=sentence.charAt ( i );
                    if((char)j == ch)
                    {
                        flag=1;
                    }
            }
            if(flag==0)
                return false;
        }
        return true;
    }
        static boolean optimize(String sentence){
            int ans[]=new int[26];
            for(int i=0;i<sentence.length ();i++){
                char ch=sentence.charAt ( i );
                ans[ch-'a']++;
            }
            for ( int i=0;i<ans.length;i++ ){
                if ( ans[i]==0 )
                    return false;
            }
            return true;
        }
}

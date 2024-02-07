public class RomanToInterger {
    public static void main ( String[] args ) {
        System.out.println (romanToInt ( "MDCCCLXXXIV" ) );
    }

    static int romanToInt(String s){
        int answer=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch (ch){
                case 'I': if (i + 1 < s.length() &&( 'V'==s.charAt ( i+1 ) ||'X'==s.charAt ( i+1 )) ){
                    answer-=1;
                } else {
                    answer+=1;
                }

                    break;
                case 'V':answer+=5;
                    break;
                case 'X':if (i + 1 < s.length() && ('L'==s.charAt ( i+1 ) ||'C'==s.charAt ( i+1 ) )){
                    answer-=10;
                }else {
                    answer+=10;
                }
                    break;
                case 'L':answer+=50;
                    break;
                case 'C':if ( i + 1 < s.length() &&('D'==s.charAt ( i+1 ) ||'M'==s.charAt ( i+1 )) ){
                    answer-=100;
                }else {
                    answer+=100;
                }

                    break;
                case 'D':answer+=500;
                    break;
                case 'M':answer+=1000;
                    break;
            }

        }
        return answer;
    }
}

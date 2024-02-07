package numbers;

import java.util.Scanner;

public class Reverseno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int last;
            int reverse=0;
            while (n>0){
                last=n%10;
                reverse=reverse*10+ last;
                n=n/10;
            }
        System.out.println(reverse);
    }
}

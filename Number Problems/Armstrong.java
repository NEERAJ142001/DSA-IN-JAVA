package numbers;

public class Armstrong {
    public static void main(String[] args) {
        boolean answer=armstrong(153);
        System.out.println(answer);
    }

   static boolean armstrong(int n) {
        int sum=0;
        int a=n;
        while (n>0){
            int last=n%10;
            sum=sum+(last*last*last);
            n=n/10;
        }
       return sum == a;
    }
}

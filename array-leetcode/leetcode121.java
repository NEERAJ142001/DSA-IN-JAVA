package array_leetcode;

public class leetcode121 {
    public static void main ( String[] args ) {
        int arr[]={7,1,5,3,6,4};
        System.out.println (maxProfit ( arr ) );

    }
    static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        if ( prices.length <= 1 )
            return 0;
        for (int i = 1; i < prices.length; i++) {

            int potentialProfit = prices[i] - minPrice;
            minPrice = Math.min(minPrice, prices[i]); // finding minimum price
            maxProfit = Math.max(maxProfit, potentialProfit); // finding maximum profit between max profit and potential-profit
        }
        return maxProfit;
    }

}

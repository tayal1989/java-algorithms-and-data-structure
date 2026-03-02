package leetcode.problems.arrays;

public class BestTimeToBuySellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[] {7,6,4,3,1}));
        System.out.println(maxProfit(new int[] {2,4,1}));
    }

    public static int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int minElement = prices[0];
        int index = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minElement) {
                minElement = prices[i];
                index = i;
            }

            int difference = prices[i] - prices[index];
            if(maximumProfit < difference) {
                maximumProfit = difference;
            }
        }

        return maximumProfit;
    }
}

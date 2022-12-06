package main.java.algoritm_questions_education.algo37_best_buy;

public class BestBuy {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {1, 3, 4, 5, 6, 7};
        System.out.println("maxProfit(prices) = " + maxProfit(prices2));
    }

    public static int maxProfit(int[] prices) {
        // Initialize the minimum price to buy...
        int minBuy = prices[0];
        // Initialize the maximum profit...
        int profit = 0;
        // Traverse all elements through a for loop...
        for (int i = 1; i < prices.length; i++) {
            // Get the minimum price to buy...
            minBuy = Math.min(minBuy, prices[i]);
            // Get maximum profit...
            profit = Math.max(profit, prices[i] - minBuy);
        }
        return profit;
    }
}

package AnsweredCodingQuestions;
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int costPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            // Using Math.min to compare the costPrice with every price in the array
            costPrice = Math.min(costPrice, prices[i]);
            // Using Math.max to compare the maxProfit with
            // (every price in the array) - (costPrice)
            maxProfit = Math.max(maxProfit, prices[i] - costPrice);
        }
        return maxProfit;
    }
}

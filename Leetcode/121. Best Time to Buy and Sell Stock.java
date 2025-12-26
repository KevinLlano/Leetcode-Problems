


public class Solution {
    // Returns the maximum profit from a single buy and sell transaction
    public int maxProfit(int[] prices) {
        // Initialize minPrice to the largest possible value
        int minPrice = Integer.MAX_VALUE;
        // Initialize maxProfit to 0
        int maxProfit = 0;

        // Iterate through each price in the array
        for (int price : prices) {
            // If current price is less than minPrice, update minPrice
            if (price < minPrice) {
                minPrice = price;
            } 
            // If selling at current price yields higher profit, update maxProfit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        // Return the maximum profit found
        return maxProfit;
    }
}



package leetCode.easy;

/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
public class E121 {
    public int maxProfit(int[] prices) {
        int highestProfit = 0;
        int lowestPrice = prices[0];

        for ( int i = 0; i < prices.length; i++ ) {

            if ( prices[i] < lowestPrice ) {
                lowestPrice = prices[i];

            } else if ( prices[i] - lowestPrice > highestProfit ) {
                highestProfit = prices[i] - lowestPrice;
                
            } else {
                continue;
            }
        }
        return highestProfit;
    }
}
// @lc code=end


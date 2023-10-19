
class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int mini = prices[0];
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            int diff = prices[i] - mini;
            profit = Math.max(profit, diff);
            mini = Math.min(mini, prices[i]);

        }
        return profit;
    }
}
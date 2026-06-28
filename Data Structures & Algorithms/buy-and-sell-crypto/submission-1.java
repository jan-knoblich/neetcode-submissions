class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;

        for (int l = 0; l < prices.length; l++) {
            for (int r = l+1; r < prices.length; r++) {
                if (prices[r] - prices[l] > result) {
                    result = prices[r]-prices[l];
                }
                if (prices[r] - prices[l] < 0) {
                    l = r;
                }
            }
        }
        return result;
    }
}

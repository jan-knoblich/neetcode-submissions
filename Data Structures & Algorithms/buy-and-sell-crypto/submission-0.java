class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int buy = Integer.MAX_VALUE;
        for (int n : prices) {
            if (n - buy > res) {
                res = n - buy;
            }
            if (n < buy) {
                buy = n;
            }
        }
        return res;
    }
}

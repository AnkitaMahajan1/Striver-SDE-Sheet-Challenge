class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int min = prices[0];
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min)min = prices[i];
            result = Math.max(result, prices[i] - min);
        }
        return result;
    }
}

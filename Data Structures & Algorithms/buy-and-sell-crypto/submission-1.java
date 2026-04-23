class Solution {
    public int maxProfit(int[] prices) {
        
        int maxValue = prices[prices.length-1];
        int maxProfit = 0;
        for(int i = prices.length-1; i>=0; i--){
            if(maxValue<prices[i]){
                maxValue = prices[i];
            }
            else{
                if(maxProfit <maxValue - prices[i]){
                    maxProfit = maxValue - prices[i];
                }
               
            }
        }

        return maxProfit;
    }
}

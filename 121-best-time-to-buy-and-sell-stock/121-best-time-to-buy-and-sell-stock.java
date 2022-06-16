class Solution {
    public int maxProfit(int[] prices) {
        
        
        /* the approach to this solution is to use a sliding window in order to check our buy and sell points */
        if (prices.length == 1) {return 0;}
        
        int buy = 0;
        int profit = 0;
        
        for (int sell = 1; sell < prices.length; sell++) {
            
            // this means our number will be positive, aka we have a profit
            if (prices[buy] < prices[sell]) {
               // comparing our current profit to our new profit
                profit = Math.max(profit, prices[sell] - prices[buy]);
            } else {
                //updating our new buy point
                buy = sell;
            }
        }
        
        return profit;
    }
        
        
        
 }

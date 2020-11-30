class Solution {
    public int maxProfit(int[] prices) {
        
        int len = prices.length;
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i =0; i < len ; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if(prices[i] -  min > maxProfit ){
                maxProfit = prices[i] - min;
            }
            
        }
        
        return maxProfit;
    }
}

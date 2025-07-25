class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minprice=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]>minprice)
            {
                int dash=prices[i]-minprice;
                profit=Math.max(profit,dash);
            }
            else
            {
                minprice=prices[i];
            }
        }
        
        return profit;
    }
}
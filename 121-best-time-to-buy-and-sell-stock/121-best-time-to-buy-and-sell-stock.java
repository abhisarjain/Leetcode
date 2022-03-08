class Solution {
    public int maxProfit(int[] prices) {
        int difference = prices[0];
        int result=0;
        for(int i=0;i<prices.length;i++)
        {
            if(difference < prices[i] )
            {
                result = Math.max(result,prices[i]-difference);
            }
            else
            {
                difference = prices[i];
            }
        }
        return result;
    }
}
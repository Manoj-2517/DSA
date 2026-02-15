//Approach used:take the 1st element as the min value and trace through the prices array and calculate the cost and update price ,min value.
//Time Complexity:O(n) to tack the prices array
//Space complexity:O(1) no extra space used.
class Solution {
    public int maxProfit(int[] prices) {
     int min = prices[0],profit=0;
     for(int i=0;i<prices.length;i++)//we started from i=0 bcoz we can buy and sell in single and same day.
        {
            int cost = prices[i]-min;
            profit = Math.max(profit,cost);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
}
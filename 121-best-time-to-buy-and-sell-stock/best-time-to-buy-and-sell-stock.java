class Solution {
    public int maxProfit(int[] prices) {
        int miniprice=prices[0];
        int maxprofit=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            miniprice=Math.min(miniprice,prices[i]);
            int profit=prices[i]-miniprice;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
        
    }
}
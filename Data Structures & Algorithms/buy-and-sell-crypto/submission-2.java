class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;

        int i=0;
        int j=1;
        while(i<prices.length && j<prices.length){
           int profit = prices[j]-prices[i];

           if(profit>=0){
            maxProfit = Math.max(maxProfit,profit);
            j++;
           }else{
            i=j;
            j++;
           }
        }

        return maxProfit;
    }
}

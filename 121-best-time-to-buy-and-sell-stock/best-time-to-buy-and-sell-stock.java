class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int max=0;
       int currProfit=0;
       int buyPrice=prices[0];
       for(int i=1;i<n;i++){
        if(buyPrice>prices[i]){
            buyPrice=prices[i];
        }
        else{
        currProfit= prices[i]-buyPrice;
        max=Math.max(max,currProfit);
       }
       }
       return max; 
    }
}
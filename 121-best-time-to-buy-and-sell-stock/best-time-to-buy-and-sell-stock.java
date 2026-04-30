class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int maxPrice=0;
       int currPrice=prices[0];
       for(int i=1;i<n;i++){
        if(prices[i]>currPrice){
            maxPrice=Math.max(maxPrice,prices[i]-currPrice);
        }
        else{
            currPrice=prices[i];

        }
       }
       return maxPrice;
    }
}
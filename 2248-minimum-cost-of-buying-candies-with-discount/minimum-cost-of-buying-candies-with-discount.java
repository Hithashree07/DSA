class Solution {
    public int minimumCost(int[] cost) {
        int minSum=0;
        int n=cost.length;
       int count=0;
        Arrays.sort(cost);
        for(int i=n-1;i>=0;i--){
            if(count==2){
                count=0;
            }
            else{
                minSum+=cost[i];
                count++;
            }
        }
        return minSum;
    }
}
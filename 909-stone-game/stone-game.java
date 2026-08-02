class Solution {
    public boolean stoneGame(int[] piles) {
        int Alice=0;
        int bob=0;
        int n=piles.length;
        int i=0,j=n-1;
        while(i<j){
            int max1=Math.max(piles[i],piles[j]);
            Alice+=max1;
            if(max1==piles[i]){
                i++;
            }
            else{
                j--;
            }
            int min=Math.min(piles[i],piles[j]);
            bob+=min;
             if(min==piles[i]){
                i++;
            }
            else{
                j--;
            }
        }
        if(Alice>bob){
            return true;
        }
        return false;
    }
}
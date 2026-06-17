class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxWater=0;
        int i=0,j=n-1;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int breadth=j-i;
            int Area=breadth*h;
            maxWater=Math.max(maxWater,Area);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
        
    }
}
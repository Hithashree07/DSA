class Solution {
    public int singleNumber(int[] nums) {
        int sin=nums[0];
        for(int i=1;i<nums.length;i++){
            sin=sin^nums[i];
        }
        return sin;
    }
}
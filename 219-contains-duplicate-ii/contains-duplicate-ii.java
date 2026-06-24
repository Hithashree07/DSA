class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer>set=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(set.containsKey(nums[i])){
            if(i-set.get(nums[i])<=k){
                return true;
            }
        }
        set.put(nums[i],i);
       }
        return false;
    }
}
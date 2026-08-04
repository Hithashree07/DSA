class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer>arr=new ArrayList<>();
        HashSet<Integer>s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=nums[0];i<=nums[nums.length-1];i++){
            if(!s.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}
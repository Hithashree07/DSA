class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer>h1=new HashMap<>();
       for(int n:nums){
        h1.put(n,h1.getOrDefault(n,0)+1);
        if(h1.get(n)>nums.length/2){
            return n;
        }
       }
       return -1;
       
    }
}
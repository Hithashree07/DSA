class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer>smaller=new ArrayList<>();
        ArrayList<Integer>equal=new ArrayList<>();
        ArrayList<Integer>greater=new ArrayList<>();
        for(int num:nums){
            if(num<pivot){
                smaller.add(num);
            }
            if(num==pivot){
                equal.add(num);
            }
            if(num>pivot){
                greater.add(num);
            }
        }
        int i=0;
        int arr[]=new int[nums.length];
        for(int num:smaller){
            arr[i++]=num;
        }
        for(int num:equal){
            arr[i++]=num;
        }
        for(int num:greater){
            arr[i++]=num;
        }
        
        return arr;
    }
}
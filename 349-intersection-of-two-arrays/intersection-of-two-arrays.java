class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>a=new HashSet<>();
        List<Integer>l1=new ArrayList<>();
        int m=nums1.length;
        int n=nums2.length;
        for(int i=0;i<m;i++){
            a.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            if(a.contains(nums2[i])){
                l1.add(nums2[i]);
                a.remove(nums2[i]);
            }
        }
        int size=l1.size();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=l1.get(i);
        }
        return arr;
    }
}
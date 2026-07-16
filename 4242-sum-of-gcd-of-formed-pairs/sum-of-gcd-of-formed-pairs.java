class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int currMax=-1;
        for(int i=0;i<n;i++){
           currMax=Math.max(nums[i],currMax);
            int gcd=gcd(currMax,nums[i]);
            arr[i]=gcd;
        }
        Arrays.sort(arr);
        long sum=0;
        int i=0,j=n-1;
        while(i<j){
            sum+=gcd(arr[i],arr[j]);
            i++;
            j--;
        }
        return sum;
    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
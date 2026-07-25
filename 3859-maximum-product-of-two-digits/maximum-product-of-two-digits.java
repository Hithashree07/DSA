class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>li=new ArrayList<>();
        int max=0;
          while(n>0){
            int rem=n%10;
            n=n/10;
            li.add(rem);
        }
        int size = li.size();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = li.get(i);
        }

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int prod=arr[i]*arr[j];
                max=Math.max(max,prod);
            }
        }
        return max;

    }
}
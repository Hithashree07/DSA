class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int sum=0;
        int add=0;
        int rep=0;
        int miss=0;
        HashSet<Integer>s1=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                add+=grid[i][j];
                if(s1.contains(grid[i][j])){
                    rep=grid[i][j];
                }
                s1.add(grid[i][j]);
            }
        }
        for(int i=1;i<=n*n;i++){
            sum+=i;
        if(sum>add){
            miss=rep+(sum-add);
        }
        else{
            miss=rep-(add-sum);
        }
        }
        int[] arr={rep,miss};
        return arr;
    }
}
class Solution {
    public int hammingWeight(int n) {
        String binary="";
        while(n>0){
            binary=n%2+binary;
            n=n/2;
        }
        int count=0;
        for(char ch:binary.toCharArray()){
            if(ch=='1'){
                count++;
            }
        }
        return count;
    }
}
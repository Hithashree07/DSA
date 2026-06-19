class Solution {
    public boolean isPowerOfTwo(int n) {
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
     if(count==1){
        return true;
     }
     return false;
    }
}
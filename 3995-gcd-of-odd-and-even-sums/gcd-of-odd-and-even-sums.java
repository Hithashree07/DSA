class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum1=0,sum2=0;
        for(int i=1;i<=(2*n)-1;i+=2){
            sum1+=i;
        }
        for(int i=2;i<=2*n;i+=2){
            sum2+=i;
        }
        while(sum2!=0){
            int temp=sum2;
            sum2=sum1%sum2;
            sum1=temp;
        }
        return sum1;
        
    }
}
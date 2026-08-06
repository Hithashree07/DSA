class Solution {
    public int smallestNumber(int n, int t) {
        while(productOfDigits(n)%t!=0){
            n++;
        }
        return n;
    }
    private int productOfDigits(int num){
        int prod=1;
            while(num>0){
                int rem=num%10;
                prod*=rem;
                num=num/10;
            }
            return prod;
    }
}
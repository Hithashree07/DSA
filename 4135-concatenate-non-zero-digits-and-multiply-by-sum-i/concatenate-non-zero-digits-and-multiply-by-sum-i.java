class Solution {
    public long sumAndMultiply(int n) {
        String s="";
        String text=String.valueOf(n);
        int sum=0;
        for(char ch:text.toCharArray()){
            if(ch!='0'){
                s+=ch;
            }
            sum+=ch-'0';
        }
        int num = s.isEmpty() ? 0 : Integer.parseInt(s);
        long res=(long)num*sum;
        return res;
        
        
    }
}
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder result=new StringBuilder();
        for(String str:words){ 
        int sum=0; 
        for(char ch:str.toCharArray()){
           sum+=weights[ch-'a']; 
        }
        int res=sum % 26;
        result.append((char)('z'-res));
        }
         return  result.toString();
    }
}
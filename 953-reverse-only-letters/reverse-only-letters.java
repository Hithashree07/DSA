class Solution {
    public String reverseOnlyLetters(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        int i=0,j=n-1;
        while(i<j){
            if(!isAlpha(ch[i])){
                i++;
            }
            else if(!isAlpha(ch[j])){
                j--;
            }
            else{
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        String res=new String(ch);
        return res;
        
    }
    public boolean isAlpha(char ch){
         if(((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))&&((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))){
            return true;
        }
        return false;
    }
}
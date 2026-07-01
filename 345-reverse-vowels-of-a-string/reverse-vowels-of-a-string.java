class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char []ch=s.toCharArray();
        while(i<j){
            if(!isVowel(ch[i])){
                i++;
            }
            else if(!isVowel(ch[j])){
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
        String str=new String(ch);
        return str;
       
    }
    private boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
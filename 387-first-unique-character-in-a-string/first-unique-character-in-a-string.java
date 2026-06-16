class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']+=1;
        }
        for(int j=0;j<s.length();j++){
            int index=s.charAt(j)-'a';
            if(arr[index]==1){
                return j;
            }
        }
        return -1;
    }
}
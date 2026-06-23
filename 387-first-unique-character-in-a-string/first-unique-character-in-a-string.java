class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        Arrays.fill(freq,0);
        int n=s.length();
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<n;i++){
            int index=s.charAt(i)-'a';
            if(freq[index]==1){
                return i;
            }
        }
        return -1;
    }
}
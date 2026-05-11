class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        char []ch=s.toCharArray();
        HashSet<Character>h=new HashSet<>();
        int maxCount=0;
        while(r<s.length()){
            if(!h.contains(ch[r])){
                int count=r-l+1;
                h.add(ch[r]);
                r++;
                maxCount=Math.max(maxCount,count);
            }
            else{
                h.remove(ch[l]);
                l++;
            }
        }
        return maxCount;
    }
}
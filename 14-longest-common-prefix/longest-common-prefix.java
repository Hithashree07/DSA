class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s=new StringBuilder();
        Arrays.sort(strs);
        int n=strs.length;
        char[] fst=strs[0].toCharArray();
        char[] last=strs[n-1].toCharArray();
        for(int i=0;i<fst.length;i++){
            if(fst[i]!=last[i]){
                break;
            }
            s.append(fst[i]);
        }
        return s.toString();

    }
}
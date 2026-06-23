class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String>h1=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            String word=words[i];
            char p=pattern.charAt(i);
            if(h1.containsKey(p)){
                if(!h1.get(p).equals(word)){
                    return false;
                }
            }
            else{
                if(h1.containsValue(word)){
                    return false;
                }
                h1.put(p,word);
            }
        }
        return true;
    }
}
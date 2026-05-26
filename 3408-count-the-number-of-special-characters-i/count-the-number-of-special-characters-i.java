class Solution {
    public int numberOfSpecialChars(String word) {
        int n=word.length();
        int count=0;
        HashSet<Character>set=new HashSet<>();
        for(char ch:word.toCharArray()){
             set.add(ch);
        }
        for(char ch='a';ch<='z';ch++){
            if(set.contains(ch)&& set.contains(Character.toUpperCase(ch))){
            count++;
            }
        }
        return count;
    }
}
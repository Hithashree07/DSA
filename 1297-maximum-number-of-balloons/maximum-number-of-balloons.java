class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[]=new int[26];
       HashMap<Character,Integer>h1=new HashMap<>();
        h1.put('b',0);
        h1.put('a',0);
        h1.put('l',0);
        h1.put('o',0);
        h1.put('n',0);
        for(char ch : text.toCharArray()){
            if(h1.containsKey(ch)){
                h1.put(ch,h1.get(ch)+1);
            }
        }
        int maxBalloons=Math.min(h1.get('b'),
        Math.min(h1.get('b'),
        Math.min(h1.get('a'),
        Math.min(h1.get('n'),
        Math.min(h1.get('l')/2,h1.get('o')/2)
        ))));
        return maxBalloons;
        
    }
}
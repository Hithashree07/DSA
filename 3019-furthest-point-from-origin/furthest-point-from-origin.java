class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        char arr[]=moves.toCharArray();
        int l=0,r=0,b=0;
        for(int i=0;i<moves.length();i++){
            if(arr[i]=='L'){
                l++;
            }
            else if(arr[i]=='R'){
                r++;
            }
            else{
                b++;
            }
        }
        return Math.abs(r-l)+b;
    }
}
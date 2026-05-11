class Solution {
    public void backTracking(ArrayList<String> list, String s, int start, int end, int n) {
        if(s.length() == 2*n) {
            list.add(s);
            return;
        }
        if(start < n) {
            backTracking(list, s+"(", start+1, end, n);
        }

        if(end < start) {
            backTracking(list, s+")",start, end+1, n);
        }  

    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        backTracking(list, "", 0, 0, n);
        return list;
    }
}
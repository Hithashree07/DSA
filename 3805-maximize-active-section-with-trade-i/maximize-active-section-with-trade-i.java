class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        String t = "1" + s + "1";
        int n = t.length();

        List<Integer> groups = new ArrayList<>();
        List<Character> chars = new ArrayList<>();

        int count = 1;
        for (int i = 1; i < n; i++) {
            if (t.charAt(i) == t.charAt(i - 1)) {
                count++;
            } else {
                groups.add(count);
                chars.add(t.charAt(i - 1));
                count = 1;
            }
        }
        groups.add(count);
        chars.add(t.charAt(n - 1));

        int totalOnes = 0;
        for (int i = 0; i < groups.size(); i++) {
            if (chars.get(i) == '1') {
                totalOnes += groups.get(i);
            }
        }
        totalOnes -= 2;

        int maxGain = 0;

        for (int i = 1; i < groups.size() - 1; i++) {
            if (chars.get(i) == '1' &&
                chars.get(i - 1) == '0' &&
                chars.get(i + 1) == '0') {

                int leftZero = groups.get(i - 1);
                int midOne = groups.get(i);
                int rightZero = groups.get(i + 1);

                int gain = leftZero + rightZero;
                maxGain = Math.max(maxGain, gain);
            }
        }

        return totalOnes + maxGain;
    }
}
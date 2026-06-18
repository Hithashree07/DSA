class Solution {
    public double angleClock(int hour, int minutes) {
        double hourAng=(hour%12)*30+minutes*0.5;
        double minAng=minutes*6;

        double diff=Math.abs(hourAng-minAng);
        return Math.min(diff,360-diff);
    }
}
/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int size = size(intervals);

        if(size==0){
            return 0;
        }

        int max = Integer.MIN_VALUE;

        int count = 0, s = 0, e = 0;

        int[] start = convertToArray(intervals, "start");

        int[] end = convertToArray(intervals, "end");

        while (s < size && e < size) {
            if (start[s] < end[e]) {
                count++;
                s++;
            } else {
                count--;
                e++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static int size(List<Interval> intervals) {
        int count = 0;
        if (null == intervals) {
            return count;
        }
        for (Interval val : intervals) {
            count++;
        }

        return count;
    }

    public static int[] convertToArray(List<Interval> intervals, String type) {
        int i = 0;
        int[] val;
        if (type.equals("start")) {
            val = intervals.stream().mapToInt(e -> e.start).sorted().toArray();
        } else {
            val = intervals.stream().mapToInt(e -> e.end).sorted().toArray();
        }

        return val;
    }
}

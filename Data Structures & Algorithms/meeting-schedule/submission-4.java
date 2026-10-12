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
    public boolean canAttendMeetings(List<Interval> intervals) {
       List<Interval> sortedIntervals = intervals.stream()
        .sorted(Comparator.comparing(x->x.start))
        .collect(Collectors.toList());

        for(int i=0;i<sortedIntervals.size()-1;i++){
            if(sortedIntervals.get(i).end>sortedIntervals.get(i+1).start){
                return false;
            }
        }

        return true;
    }
}

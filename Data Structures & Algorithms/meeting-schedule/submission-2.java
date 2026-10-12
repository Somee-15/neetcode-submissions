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
        List<List<Integer>> listInterval = convertToList(intervals);
        List<List<Integer>> mergeInterval = getMerge(listInterval);

        return listInterval.size() == mergeInterval.size();
    }

    public List<List<Integer>> convertToList(List<Interval> intervals) {
        List<List<Integer>> finalVal = new ArrayList<>();
        for (Interval val : intervals) {
            List<Integer> list = new ArrayList(Arrays.asList(val.start, val.end));
            finalVal.add(list);
        }

        return finalVal.stream()
            .sorted(Comparator.comparing(x -> x.get(0)))
            .collect(Collectors.toList());
    }

    public List<List<Integer>> getMerge(List<List<Integer>> intervals) {
        List<List<Integer>> merge = new ArrayList<>();
        for (List<Integer> val : intervals) {
            if (merge.isEmpty() || merge.get(merge.size() - 1).get(1) <= val.get(0)) {
                merge.add(val);
            } else {
                merge.get(merge.size() - 1)
                    .set(1,
                        val.get(1) > merge.get(merge.size() - 1).get(1)
                            ? val.get(1)
                            : merge.get(merge.size() - 1).get(1));
            }
        }

        return merge;
    }
}

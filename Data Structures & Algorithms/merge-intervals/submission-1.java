class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merge = new ArrayList<>();

        for (int[] val : intervals) {
            // System.out.println(Arrays.toString(val));
            if (merge.isEmpty() || merge.get(merge.size() - 1)[1] < val[0]) {
                merge.add(val);
            } else {
                merge.get(merge.size() - 1)[1] = merge.get(merge.size() - 1)[1] < val[1]
                    ? val[1]
                    : merge.get(merge.size() - 1)[1];
            }
        }
        // for (int[] val : merge) {
        //     System.out.println(Arrays.toString(val));
        // }

        return merge.toArray(new int[merge.size()][]);
    }
}

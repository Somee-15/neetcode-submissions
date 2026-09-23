class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
          for (int v : nums) freq.merge(v, 1, Integer::sum);

          List<Integer>[] bucket = new List[nums.length + 1];
          for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
              int f = e.getValue();
              if (bucket[f] == null) bucket[f] = new ArrayList<>();
              bucket[f].add(e.getKey());
          }

          int[] ans = new int[k];
          int idx = 0;
          for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
              if (bucket[i] == null) continue;
              for (int num : bucket[i]) {
                  ans[idx++] = num;
                  if (idx == k) break;
              }
          }
          return ans;
    }
}

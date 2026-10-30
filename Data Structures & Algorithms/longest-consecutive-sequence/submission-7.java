class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet();
        for (int a : nums) {
            set.add(a);
        }
        int longest = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int curr = num, len = 1;
                while (set.contains(curr + 1)) {
                    len++;
                    curr++;
                }

                longest = Math.max(len, longest);
            }
        }

        return longest;
    }
}

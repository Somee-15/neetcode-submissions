class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] <= 0 || nums[i] > n) {
                i++;
                continue;
            }
            int val = nums[i] - 1;

            if (nums[i] != nums[val]) {
                swap(i, val, nums);
            } else {
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        // System.out.println(Arrays.toString(nums));

        return n + 1;
    }

    private void swap(int i, int j, int[] nums) {
        if (nums[i] == nums[j] || j > nums.length || i > nums.length) {
            return;
        }
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
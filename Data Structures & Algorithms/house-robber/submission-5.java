class Solution {
    public int rob(int[] nums) {
        int sum = 0;
        int i = 0;
        HashMap<Integer, Integer> mem = new HashMap();
        return (maxMoney(i, nums, sum, mem));
    }

    private int maxMoney(int i, int[] nums, int sum, HashMap<Integer, Integer> mem) {
        if (i >= nums.length) {
            return 0;
        }

        if (mem.containsKey(i)) {
            return mem.get(i);
        } else {
            int temp = nums[i] + maxMoney(i + 2, nums, sum,mem);
            sum = sum + maxMoney(i + 1, nums, sum,mem);
            sum = Math.max(sum, temp);
            mem.put(i,sum);
        }
        return mem.get(i);
    }
}

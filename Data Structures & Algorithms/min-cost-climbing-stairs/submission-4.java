class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        int[] dp = new int[size + 1];

        minCal(size, cost, dp);
        return dp[size];
    }

    private int[] minCal(int j, int[] cost, int[] dp) {
        if (j < 2) {
            dp[j] = 0;
        } else {
            for (int i = 2; i <= cost.length; i++) {
                dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
            }
        }

        return dp;
    }
}

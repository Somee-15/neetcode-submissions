class Solution {
    public int climbStairs(int n) {
        int[] mem = new int[n];

        return calculate(n, mem);
    }

    private int calculate(int n, int[] mem) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        mem[0] = 1;
        mem[1] = 2;

        for (int i = 2; i < n; i++) {
            mem[i] = mem[i - 1] + mem[i - 2];
        }
        return mem[n - 1];
    }
}

class Solution {
    public int coinChange(int[] coins, int amount) {
        HashMap<Integer, Integer> mem = new HashMap<>();
        mem.put(0, 0);
        Arrays.sort(coins);

        findVal(coins, amount, mem);
        return mem.get(amount)==Integer.MAX_VALUE?-1:mem.get(amount);
    }

    public static int findVal(int[] coins, int amount, HashMap<Integer, Integer> mem) {
        if (mem.containsKey(amount)) {
            return mem.get(amount);
        }

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {
            int require = amount - coin;

            if (require < 0)
                break;

            int res = findVal(coins, require, mem);
            if (res != Integer.MAX_VALUE) {
                min = Math.min(min, res + 1);
            }
        }
        mem.put(amount, min);

        return min;
    }
}

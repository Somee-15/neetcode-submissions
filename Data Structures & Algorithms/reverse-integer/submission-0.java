class Solution {
    public int reverse(int x) {
        int temp = Math.abs(x);
        int ans = 0;
        while (temp > 0) {
            int rem = temp % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && rem > 7))
                return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && rem < -8))
                return 0;

            ans = ans * 10 + rem;
            System.out.println(ans);
            temp = temp / 10;
        }

        return x<0?-ans:ans;
    }
}

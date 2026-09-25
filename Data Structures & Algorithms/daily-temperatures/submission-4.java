class Solution {
    public int[] dailyTemperatures(int[] a) {
        ArrayDeque<Integer> stack = new ArrayDeque();
        int size = a.length;
        int[] ans = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                ans[i] = 0;
                stack.push(i);
            } else {
                while (!stack.isEmpty() && a[i]>=a[stack.peek()]) {
                   stack.pop();
                }

                if (stack.isEmpty()) {
                    ans[i] = 0;
                   
                } else {
                    ans[i] = stack.peek()-i;
                
                }

                 stack.push(i);
            }
        }

        // for (int i = size - 1; i >= 0; i--) {
        //     if (stack.isEmpty()) {
        //         ans[i] = 0;
        //         stack.push(a[i]);
        //     } else {
        //         while (!stack.isEmpty() && a[i] >= stack.peek()) {
        //            stack.pop();
        //         }

        //         if (stack.isEmpty()) {
        //             ans[i] = 0;
                   
        //         } else {
        //             ans[i] = stack.peek();
                
        //         }

        //          stack.push(a[i]);
        //     }
        // }

        return ans;
    }
}

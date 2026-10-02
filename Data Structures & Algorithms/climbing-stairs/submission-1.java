class Solution {
    public int climbStairs(int n) {
        HashMap mem = new HashMap();
        mem.put(1,1);
        mem.put(2,2);

        return calculate(n ,mem);
    }

    private int calculate(int n, HashMap<Integer, Integer> mem) {
       if(mem.containsKey(n)){
        return mem.get(n);
       }else{
        mem.put(n,calculate(n-1,mem)+calculate(n-2,mem));
       }
       return mem.get(n);
    }
}

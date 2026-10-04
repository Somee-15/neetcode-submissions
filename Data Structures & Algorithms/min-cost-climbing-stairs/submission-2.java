class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        HashMap<Integer,Integer> mem = new HashMap();
        mem.put(0,0);
        mem.put(1,0);

        return minCal(size,cost,mem);
    }


    private int minCal(int i,int[] cost,HashMap<Integer,Integer> mem){
        if(mem.containsKey(i)){
            return mem.get(i);
        }else{
            mem.put(i,Math.min(minCal(i-2,cost,mem)+cost[i-2],minCal(i-1,cost,mem)+cost[i-1]));
        }

       return mem.get(i);

    
    }
}

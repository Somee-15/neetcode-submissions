class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int size = cost.length;
      
        return minCal(size,cost);
    }


    private int minCal(int i,int[] cost){
         if(i<2){
        return 0;
       }

       return Math.min(minCal(i-2,cost)+cost[i-2],minCal(i-1,cost)+cost[i-1]);

    }
}



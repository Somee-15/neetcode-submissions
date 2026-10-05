class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high=-1;
       

        for(int val:piles){
            high=Math.max(high,val);
        }

         int ans =high;

        while(low<=high){
            int mid = low+(high-low)/2;
            System.out.println(mid);
            if(isPerHourValSafe(h,piles,mid)){
                ans=mid;
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }

        return ans;
    }

    private boolean isPerHourValSafe(int hour,int[] piles,int perHour){
        int totalTime=0;

           for (int p : piles) {
                totalTime += Math.ceil((double) p / perHour);
            }

        return totalTime<=hour;

    }
}

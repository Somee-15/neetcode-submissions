class Solution {
    public int climbStairs(int n) {
          if(n==1){
            return 1;
        }

        if(n==2){
            return 2;
        }

        int prev=1,curr=2;

        for(int i=2;i<n;i++){
            int next = prev+curr;
            prev=curr;
            curr=next;
        }

        return curr;
    }
}

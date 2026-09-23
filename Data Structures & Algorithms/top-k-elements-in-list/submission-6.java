class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

       PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->a[1]-b[1]);

       for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        int[] array = new int[2];
        array[0]=entry.getKey();
        array[1]=entry.getValue();
        queue.add(array);
        if(queue.size()>k){
          queue.poll(); 
        }        

       }

       int[] ans = new int[k];

       for(int i=0;i<k;i++){
        int[] val = queue.poll();
        ans[i]=val[0];
       }

       return ans;
    }
}

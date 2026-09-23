class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> countMap = new HashMap();
        int[] result =new int[k];
        Integer integerZero = 0;
       
       for(int i=0;i<nums.length;i++){
        countMap.put(nums[i],countMap.getOrDefault(Integer.valueOf(nums[i]),integerZero)+1);
        
       } 
       HashMap<Integer,Integer> countMapSorted= countMap.entrySet()
       .stream()
       .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
       .collect(Collectors.toMap(
        Map.Entry::getKey,
        Map.Entry::getValue,
        (oldvalue,newvalue)->oldvalue,
        LinkedHashMap::new
       ));

       int i=0;
       for(Map.Entry<Integer,Integer> entry:countMapSorted.entrySet()){
        if(i<k){
        result[i]=entry.getKey();
        i++;
        }
       }
       

       return result;
    }
}
